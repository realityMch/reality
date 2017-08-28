package com.reality.scout.tstub.boss.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterFacade {

	public String handle(HttpServletRequest request, HttpServletResponse response);
}
