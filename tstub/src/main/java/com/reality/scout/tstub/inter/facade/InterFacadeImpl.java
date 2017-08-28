package com.reality.scout.tstub.inter.facade;

import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reality.scout.tstub.boss.inter.InterFacade;
import com.reality.scout.tstub.inter.Inter;
import com.reality.scout.tstub.inter.context.BeanHolder;

public class InterFacadeImpl implements InterFacade {

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String[]> paramMap = request.getParameterMap();
		Map<String, Inter> beanMap = BeanHolder.getInstance().findBeanForType(Inter.class);
		Inter inter = null;
		for (Entry<String, Inter> entry : beanMap.entrySet()) {
			inter = entry.getValue();
			Map<String, String> paramRegulars = inter.getReqParameter();
			if (paramMap == null || paramRegulars == null) {
				continue;
			}
			if (paramMap.size() == paramRegulars.size() && paramMap.keySet().containsAll(paramRegulars.keySet())) {
				for (Entry<String, String[]> entry2 : paramMap.entrySet()) {
					String paramName = entry2.getKey();
					String[] paramValue = entry2.getValue();
					if (!paramValue[0].matches(paramRegulars.get(paramName))) {
						inter = null;
						break;
					}
				}
			} else {
				inter = null;
			}
			if (inter != null) {
				break;
			}
		}
		if (inter != null) {
			return inter.accept(request, response);
		} else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
	}
}
