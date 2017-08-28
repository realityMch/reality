package com.reality.scout.tstub.boss.inter.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reality.scout.tstub.boss.inter.InterFacade;

public class SystemStateInterFacadeImpl implements InterFacade {

	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
		return null;
	}

}
