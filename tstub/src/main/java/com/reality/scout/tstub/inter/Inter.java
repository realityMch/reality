package com.reality.scout.tstub.inter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Inter {

	public void init();
	
	public Map<String, String> getReqParameter();
	
	public String accept(HttpServletRequest request, HttpServletResponse response);
}
