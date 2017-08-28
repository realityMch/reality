package com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.reality.scout.tstub.inter.Inter;
import com.reality.scout.tstub.inter.dao.BaseDao;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1.entity.Common;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1.util.POJOHelper;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1.xml.Header;
import com.reality.scout.tstub.inter.util.XStreamFactory;
/**
 * 业务预办理结果通知和支付通知接口
 * @author mengchao
 *
 */
@Component("IsspV1S102_101Inter")
public class IsspV1S102_101InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("ThirdV1S101_101InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>S102_101</ActivityCode>.*</GRoaming>$");
		reqParamMap.put("xmlbody", "^.*<Body>.*<TransactionId>.*</TransactionId>.*</GRoaming>$");
	}

	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}
	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String xmlbody = request.getParameter("xmlbody");
		String interId = xmlbody.substring(xmlbody.indexOf("<TransactionId>") + "<TransactionId>".length(), xmlbody.indexOf("</TransactionId>"));
		String commonId = "S102_101" + "##" + interId;
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
