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
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.rsp.T3000305;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.InterBOSS;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp.GprsPauseRsp;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 数据功能暂停/恢复请求接口
 * @author mengchao
 *
 */
@Component("TsnV1T3000305Inter")
public class TsnV1T3000305InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("TsnV1T3000305InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>T3000305</ActivityCode>.*</InterBOSS>$");
		reqParamMap.put("xmlbody", "^.*<gprsPauseReq>.*<MSISDN>.*</MSISDN>.*$");
	}
	
	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String xmlbody = request.getParameter("xmlbody");
		String interId = xmlbody.substring(xmlbody.indexOf("<MSISDN>") + "<MSISDN>".length(), xmlbody.indexOf("</MSISDN>"));
		String commonId = "T3000305" + "##" + interId;
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
			T3000305 t3000305 = baseDao.find(T3000305.class, interId);
			if (t3000305 == null) {
				interBOSS.setSvcCont(null);
			} else {
				GprsPauseRsp gprsPauseRsp = new GprsPauseRsp();
				gprsPauseRsp.setMsgTransactionID(t3000305.getMsgTransactionID());
				gprsPauseRsp.setCfmResultCode(t3000305.getCfmResultCode());
				gprsPauseRsp.setCfmResultCodeDesc(t3000305.getCfmResultCodeDesc());
				if (t3000305.getGprsPauseInfo() == null) {
					gprsPauseRsp.setGprsPauseInfo(null);
				} else {
					gprsPauseRsp.getGprsPauseInfo().setMSISDN(t3000305.getMSISDN());
					gprsPauseRsp.getGprsPauseInfo().setProvCode(t3000305.getProvCode());
					gprsPauseRsp.getGprsPauseInfo().setOprTIMSI(t3000305.getOprTIMSI());
					gprsPauseRsp.getGprsPauseInfo().setServType(t3000305.getServType());
					gprsPauseRsp.getGprsPauseInfo().setEffTIMSI(t3000305.getEffTIMSI());
					gprsPauseRsp.getGprsPauseInfo().setServParamInfo(null);
				}
				String svcCont = XStreamFactory.createXStream().toXML(gprsPauseRsp);
				String sInterBOSS = XStreamFactory.createXStream().toXML(interBOSS);
				return sInterBOSS.replaceAll("<SvcCont>.*</SvcCont>", "<SvcCont><![CDATA[" + svcCont + "]]></SvcCont>");

			}
		}
		return XStreamFactory.createXStream().toXML(interBOSS);
	}

}
