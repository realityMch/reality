package com.reality.scout.tstub.inter.impl.cmsz.ircn.third.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.reality.scout.tstub.inter.Inter;
import com.reality.scout.tstub.inter.dao.BaseDao;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.third.v1.ThirdV1R101_101InterImpl;
/**
 * 
 * @author mengchao
 *
 */
@Component("ThirdV2R101_101Inter")
public class ThirdV2R101_101InterImpl implements Inter {

	private static final Map<String, String> reqParamMap = new ConcurrentHashMap<String, String>();
	
	@Resource
	private BaseDao baseDao;
	@Resource
	private ThirdV1R101_101InterImpl thirdV1R101_101Inter;
	@Override
	@PostConstruct
	public void init() {
		System.out.println("ThirdV2R101_101InterImpl init");
		reqParamMap.put("xmlhead", "^.*<ActivityCode>R101_101</ActivityCode>.*</GRoaming>$");
		reqParamMap.put("xmlbody", "^.*<Body>.*<TransactionId>.*</TransactionId>.*</GRoaming>$");
		reqParamMap.put("xmlsign", "^.*<Sign>.*</Sign></GRoaming>$");
	}

	@Override
	public Map<String, String> getReqParameter() {
		return reqParamMap;
	}

	@Override
	public String accept(HttpServletRequest request, HttpServletResponse response) {
		String rsp = thirdV1R101_101Inter.accept(request, response);
		return null;
	}

}
