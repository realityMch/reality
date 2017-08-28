package com.reality.scout.tstub.inter.impl.cmsz.ircn.irws.v1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.reality.scout.tstub.inter.Inter;
import com.reality.scout.tstub.inter.dao.BaseDao;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.irws.v1.entity.Common;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.irws.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.irws.v1.xml.Header;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 国漫功能开通/关闭结果通知接口
 * @author mengchao
 *
 */
@Component("IrwsV1W101_101Inter")
public class IrwsV1W101_101InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("IrwsV1W101_101InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>W101_101</ActivityCode>.*<Msisdn>.*</Msisdn>.*</GRoaming>$");
		reqParamMap.put("xmlbody", "^.*<Body>.*</GRoaming>$");
	}

	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String xmlhead = request.getParameter("xmlhead");
		String interId = xmlhead.substring(xmlhead.indexOf("<Msisdn>") + "<Msisdn>".length(), xmlhead.indexOf("</Msisdn>"));
		String commonId = "W101_101" + "##" + interId;
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
