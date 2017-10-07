package com.reality.scout.tstub;

import org.springframework.util.StringUtils;

public class Test {
	

	public static void main(String[] args) {
		System.out.println("shite");
		System.out.println(HanDict.pyMap.get("英"));
	//	System.out.println(HanDict.pyMap.get("b").size());
		String a = null;
		if (StringUtils.isEmpty(a)) {
			a = "hello world";
		};
		String b = a.toLowerCase();
		System.out.println(b);
	}
}
