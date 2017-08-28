package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.reality.scout.tstub.inter.Inter;
import com.reality.scout.tstub.inter.dao.BaseDao;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.Common;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.rsp.T3000304;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.InterBOSS;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp.InterRoamFuncManageRsp;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 网状网国漫功能开通/关闭接口
 * @author mengchao
 *
 */
@Component("TsnV1T3000304Inter")
public class TsnV1T3000304InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("TsnV1T3000304InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>T3000304</ActivityCode>.*</InterBOSS>$");
		reqParamMap.put("xmlbody", "^.*<InterRoamFuncManageReq>.*<MSISDN>.*</MSISDN>.*$");
	}

	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String xmlhead = request.getParameter("xmlhead");
		String xmlbody = request.getParameter("xmlbody");
		String interId = xmlbody.substring(xmlbody.indexOf("<MSISDN>") + "<MSISDN>".length(), xmlbody.indexOf("</MSISDN>"));
		String commonId = "T3000304" + "##" + interId;
		Common common = baseDao.find(Common.class, commonId);
		if (common == null) {
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			return null;
		} else if (common.getCommon() != null) {
			return common.getCommon();
		}
		InterBOSS interBOSS = POJOHelper.setInterBOSS(common);
		
		if (interBOSS.getResponse() == null) {
			return XStreamFactory.createXStream().toXML(interBOSS);
		}
		
		if ("-".equals(interBOSS.getSvcCont())) {
			T3000304 t3000304 = baseDao.find(T3000304.class, interId);
			if (t3000304 == null) {
				interBOSS.setSvcCont(null);
			} else {
				InterRoamFuncManageRsp interRoamFuncManageRsp = new InterRoamFuncManageRsp();
				interRoamFuncManageRsp.setMsgTransactionID(t3000304.getMsgTransactionID());
				interRoamFuncManageRsp.setCfmResultCode(t3000304.getCfmResultCode());
				interRoamFuncManageRsp.setCfmResultCodeDesc(t3000304.getCfmResultCodeDesc());
				if (t3000304.getInterRoamInfo() == null) {
					interRoamFuncManageRsp.setInterRoamInfo(null);
				} else {
					interRoamFuncManageRsp.getInterRoamInfo().setMSISDN(t3000304.getMSISDN());
					interRoamFuncManageRsp.getInterRoamInfo().setProvCode(t3000304.getProvCode());
					interRoamFuncManageRsp.getInterRoamInfo().setOprTIMSI(t3000304.getOprTIMSI());
					interRoamFuncManageRsp.getInterRoamInfo().setServType(t3000304.getServType());
					interRoamFuncManageRsp.getInterRoamInfo().setActionID(t3000304.getActionID());
					interRoamFuncManageRsp.getInterRoamInfo().setEffTIMSI(t3000304.getEffTIMSI());
					interRoamFuncManageRsp.getInterRoamInfo().setExpTIMSI(t3000304.getExpTIMSI());
					interRoamFuncManageRsp.getInterRoamInfo().setServParamInfo(null);
				}
				String svcCont = XStreamFactory.createXStream().toXML(interRoamFuncManageRsp);
				String sInterBOSS = XStreamFactory.createXStream().toXML(interBOSS);
				return sInterBOSS.replaceAll("<SvcCont>.*</SvcCont>", "<SvcCont><![CDATA[" + svcCont + "]]></SvcCont>");
			}
		}
		return XStreamFactory.createXStream().toXML(interBOSS);
	}

}
