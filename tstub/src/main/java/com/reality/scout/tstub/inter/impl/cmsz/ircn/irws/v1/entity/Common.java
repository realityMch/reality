package com.reality.scout.tstub.inter.impl.cmsz.ircn.irws.v1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tstub_irws_v1_common")
public class Common {

	@Id
	private String ID;
	
	private String GRoaming;
	
	private String Header;
	
	private String ActivityCode;
	
	private String ReqSys;
	
	private String Msisdn;
	
	private String AcessCode;
	
	private String ReqDate;
	
	private String ReqTransID;
	
	private String ReqDateTime;
	
	private String ActionCode;
	
	private String RcvSys;
	
	private String RcvDate;
	
	private String RcvTransID;
	
	private String RcvDateTime;
	
	private String RspCode;
	
	private String RspDesc;
	
	private String Body;
	
	private String common;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getGRoaming() {
		return GRoaming;
	}

	public void setGRoaming(String gRoaming) {
		GRoaming = gRoaming;
	}

	public String getHeader() {
		return Header;
	}

	public void setHeader(String header) {
		Header = header;
	}

	public String getActivityCode() {
		return ActivityCode;
	}

	public void setActivityCode(String activityCode) {
		ActivityCode = activityCode;
	}

	public String getReqSys() {
		return ReqSys;
	}

	public void setReqSys(String reqSys) {
		ReqSys = reqSys;
	}

	public String getMsisdn() {
		return Msisdn;
	}

	public void setMsisdn(String msisdn) {
		Msisdn = msisdn;
	}

	public String getAcessCode() {
		return AcessCode;
	}

	public void setAcessCode(String acessCode) {
		AcessCode = acessCode;
	}

	public String getReqDate() {
		return ReqDate;
	}

	public void setReqDate(String reqDate) {
		ReqDate = reqDate;
	}

	public String getReqTransID() {
		return ReqTransID;
	}

	public void setReqTransID(String reqTransID) {
		ReqTransID = reqTransID;
	}

	public String getReqDateTime() {
		return ReqDateTime;
	}

	public void setReqDateTime(String reqDateTime) {
		ReqDateTime = reqDateTime;
	}

	public String getActionCode() {
		return ActionCode;
	}

	public void setActionCode(String actionCode) {
		ActionCode = actionCode;
	}

	public String getRcvSys() {
		return RcvSys;
	}

	public void setRcvSys(String rcvSys) {
		RcvSys = rcvSys;
	}

	public String getRcvDate() {
		return RcvDate;
	}

	public void setRcvDate(String rcvDate) {
		RcvDate = rcvDate;
	}

	public String getRcvTransID() {
		return RcvTransID;
	}

	public void setRcvTransID(String rcvTransID) {
		RcvTransID = rcvTransID;
	}

	public String getRcvDateTime() {
		return RcvDateTime;
	}

	public void setRcvDateTime(String rcvDateTime) {
		RcvDateTime = rcvDateTime;
	}

	public String getRspCode() {
		return RspCode;
	}

	public void setRspCode(String rspCode) {
		RspCode = rspCode;
	}

	public String getRspDesc() {
		return RspDesc;
	}

	public void setRspDesc(String rspDesc) {
		RspDesc = rspDesc;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}
}
