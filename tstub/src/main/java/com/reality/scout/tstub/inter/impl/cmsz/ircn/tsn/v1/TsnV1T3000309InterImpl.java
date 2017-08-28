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
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.rsp.T3000309;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.InterBOSS;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp.UserinfoQryRsp;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 用户基本信息查询接口
 * @author mengchao
 *
 */
@Component("TsnV1T3000309Inter")
public class TsnV1T3000309InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("TsnV1T3000309InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>T3000309</ActivityCode>.*</InterBOSS>$");
		reqParamMap.put("xmlbody", "^.*<userinfoQryReq>.*<MSISDN>.*</MSISDN>.*$");
	}
	
	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
//		String xmlhead = request.getParameter("xmlhead");
		String xmlbody = request.getParameter("xmlbody");
		String interId = xmlbody.substring(xmlbody.indexOf("<MSISDN>") + "<MSISDN>".length(), xmlbody.indexOf("</MSISDN>"));
		String commonId = "T3000309" + "##" + interId;
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
			T3000309 t3000309 = baseDao.find(T3000309.class, interId);
			if (t3000309 == null) {
				interBOSS.setSvcCont(null);
			} else {
				UserinfoQryRsp userinfoQryRsp = new UserinfoQryRsp();
				userinfoQryRsp.setMsgTransactionID(t3000309.getMsgTransactionID());
				userinfoQryRsp.setCfmResultCode(t3000309.getCfmResultCode());
				userinfoQryRsp.setCfmResultCodeDesc(t3000309.getCfmResultCodeDesc());
				if (t3000309.getSubscriptionInfo() == null) {
					userinfoQryRsp.setSubscriptionInfo(null);
				} else {
					userinfoQryRsp.getSubscriptionInfo().setMSISDN(t3000309.getMSISDN());
					userinfoQryRsp.getSubscriptionInfo().setProvCode(t3000309.getProvCode());
					userinfoQryRsp.getSubscriptionInfo().setOprTIMSI(t3000309.getOprTIMSI());
					userinfoQryRsp.getSubscriptionInfo().setIMSI(t3000309.getIMSI());
					userinfoQryRsp.getSubscriptionInfo().setEffTIMSI(t3000309.getEffTIMSI());
					userinfoQryRsp.getSubscriptionInfo().setBrand(t3000309.getBrand());
					userinfoQryRsp.getSubscriptionInfo().setUserType(t3000309.getUserType());
					userinfoQryRsp.getSubscriptionInfo().setLevel(t3000309.getCol_level());
					userinfoQryRsp.getSubscriptionInfo().setUserstat(t3000309.getUserstat());
					userinfoQryRsp.getSubscriptionInfo().setInterRoamFuncstat(t3000309.getInterRoamFuncstat());
					userinfoQryRsp.getSubscriptionInfo().setServType(t3000309.getServType());
					userinfoQryRsp.getSubscriptionInfo().setEffTIMSI2(t3000309.getEffTIMSI2());
					userinfoQryRsp.getSubscriptionInfo().setValidityDate(t3000309.getValidityDate());
					userinfoQryRsp.getSubscriptionInfo().setIsBlacklist(t3000309.getIsBlacklist());
					userinfoQryRsp.getSubscriptionInfo().setIsBalanceJud(t3000309.getIsBalanceJud());
					userinfoQryRsp.getSubscriptionInfo().setUserbalance(t3000309.getUserbalance());
					userinfoQryRsp.getSubscriptionInfo().setIDDFuncstat(t3000309.getIDDFuncstat());
					userinfoQryRsp.getSubscriptionInfo().setIDDServType(t3000309.getIDDServType());
					userinfoQryRsp.getSubscriptionInfo().setIDDEffTIMSI(t3000309.getIDDEffTIMSI());
					userinfoQryRsp.getSubscriptionInfo().setIDDValidityDate(t3000309.getIDDValidityDate());
					userinfoQryRsp.getSubscriptionInfo().setServParamInfo(null);
				}
				String svcCont = XStreamFactory.createXStream().toXML(userinfoQryRsp);
				String sInterBOSS = XStreamFactory.createXStream().toXML(interBOSS);
				return sInterBOSS.replaceAll("<SvcCont>.*</SvcCont>", "<SvcCont><![CDATA[" + svcCont + "]]></SvcCont>");
			}
		}
		
		return XStreamFactory.createXStream().toXML(interBOSS);
	}

}
