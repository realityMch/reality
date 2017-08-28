package com.reality.scout.tstub.inter.impl.cmsz.ircn.ircp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.reality.scout.tstub.inter.Inter;
import com.reality.scout.tstub.inter.dao.BaseDao;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.ircp.entity.Common;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.ircp.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.ircp.xml.Header;
import com.reality.scout.tstub.inter.util.XStreamFactory;

@Component("IrcpV1C101_002Inter")
public class IrcpV1C101_002InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("IrcpV1C101_002InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>C101_002</ActivityCode>.*</GRoaming>$");
		reqParamMap.put("xmlbody", "^.*<Body>.*<TransactionId>.*</TransactionId>.*</GRoaming>$");
	}

	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String xmlhead = request.getParameter("xmlhead");
		String interId = xmlhead.substring(xmlhead.indexOf("<Msisdn>") + "<Msisdn>".length(), xmlhead.indexOf("</Msisdn>"));
		String commonId = "C101_002" + "##" + interId;
		Common common = baseDao.find(Common.class, commonId);
		if (common == null) {
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			return null;
		} else if (common.getCommon() != null) {
			return common.getCommon();
		}
		Header header = POJOHelper.setHeader(common);
		String rsp = "<GRoaming>" + XStreamFactory.createXStream().toXML(header) + "<Body></Body></GRoaming>";
		return rsp;
	}

}
