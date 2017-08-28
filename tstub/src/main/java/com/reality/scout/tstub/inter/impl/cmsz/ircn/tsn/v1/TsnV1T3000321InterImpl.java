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
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.rsp.T3000321;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.InterBOSS;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp.IDDFuncManageRsp;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 国际长途功能开通/关闭接口
 * @author mengchao
 *
 */
@Component("TsnV1T3000321Inter")
public class TsnV1T3000321InterImpl implements Inter {

private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("TsnV1T3000321InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>T3000321</ActivityCode>.*</InterBOSS>$");
		reqParamMap.put("xmlbody", "^.*<IDDFuncManageReq>.*<MSISDN>.*</MSISDN>.*$");
	}
	
	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String xmlbody = request.getParameter("xmlbody");
		String interId = xmlbody.substring(xmlbody.indexOf("<MSISDN>") + "<MSISDN>".length(), xmlbody.indexOf("</MSISDN>"));
		String commonId = "T3000321" + "##" + interId;
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
			T3000321 t3000321 = baseDao.find(T3000321.class, interId);
			if (t3000321 == null) {
				interBOSS.setSvcCont(null);
			} else {
				IDDFuncManageRsp iddFuncManageRsp = new IDDFuncManageRsp();
				iddFuncManageRsp.setMsgTransactionID(t3000321.getMsgTransactionID());
				iddFuncManageRsp.setCfmResultCode(t3000321.getCfmResultCode());
				iddFuncManageRsp.setCfmResultCodeDesc(t3000321.getCfmResultCodeDesc());
				if (t3000321.getIDDInfo() == null) {
					iddFuncManageRsp.getIDDInfo().setMSISDN(t3000321.getMSISDN());
					iddFuncManageRsp.getIDDInfo().setProvCode(t3000321.getProvCode());
					iddFuncManageRsp.getIDDInfo().setOprTIMSI(t3000321.getOprTIMSI());
					iddFuncManageRsp.getIDDInfo().setServType(t3000321.getServType());
					iddFuncManageRsp.getIDDInfo().setActionID(t3000321.getActionID());
					iddFuncManageRsp.getIDDInfo().setEffTIMSI(t3000321.getEffTIMSI());
					iddFuncManageRsp.getIDDInfo().setExpTIMSI(t3000321.getExpTIMSI());
					iddFuncManageRsp.getIDDInfo().setServParamInfo(null);
				}
				String svcCont = XStreamFactory.createXStream().toXML(iddFuncManageRsp);
				String sInterBOSS = XStreamFactory.createXStream().toXML(interBOSS);
				return sInterBOSS.replaceAll("<SvcCont>.*</SvcCont>", "<SvcCont><![CDATA[" + svcCont + "]]></SvcCont>");
			}
		}
		return XStreamFactory.createXStream().toXML(interBOSS);
	}

}
