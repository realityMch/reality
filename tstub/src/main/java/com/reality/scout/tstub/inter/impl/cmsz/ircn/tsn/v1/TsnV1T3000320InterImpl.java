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
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.InterBOSS;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 自有线上渠道国际长途功能开通/关闭结果反馈接口
 * @author mengchao
 *
 */
@Component("TsnV1T3000320Inter")
public class TsnV1T3000320InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();

	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("TsnV1T3000320InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>T3000320</ActivityCode>.*</InterBOSS>$");
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
		String commonId = "T3000320" + "##" + interId;
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
			interBOSS.setSvcCont("");
		}
		return XStreamFactory.createXStream().toXML(interBOSS);
	}
}
