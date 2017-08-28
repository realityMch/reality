package com.reality.scout.tstub.inter.impl.cmsz.ircn.third.v2.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = "Sign")
public class Sign {

	private String CerID;
	
	private String SignValue;

	public String getCerID() {
		return CerID;
	}

	public void setCerID(String cerID) {
		CerID = cerID;
	}

	public String getSignValue() {
		return SignValue;
	}

	public void setSignValue(String signValue) {
		SignValue = signValue;
	}
}
