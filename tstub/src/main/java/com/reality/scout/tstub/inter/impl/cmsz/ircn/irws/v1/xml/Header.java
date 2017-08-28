package com.reality.scout.tstub.inter.impl.cmsz.ircn.irws.v1.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author mengchao
 *
 */
@XStreamAlias(value = "Header")
public class Header {
	/**
	 * 交易代码
	 */
	private String ActivityCode;
	/**
	 * 发起方系统编码
	 */
	private String ReqSys;
	/**
	 * 用户手机号码
	 */
	private String Msisdn;
	/**
	 * 渠道编码
	 */
	private String AcessCode;
	/**
	 * 发起方日期
	 */
	private String ReqDate;
	/**
	 * 发起方交易流水号
	 */
	private String ReqTransID;
	/**
	 * 发起方时间戳
	 */
	private String ReqDateTime;
	/**
	 * 交易动作代码
	 */
	private String ActionCode;
	/**
	 * 接收方系统编码
	 */
	private String RcvSys;
	/**
	 * 接收方交易日期
	 */
	private String RcvDate;
	/**
	 * 接收方交易流水号
	 */
	private String RcvTransID;
	/**
	 * 接收方时间戳
	 */
	private String RcvDateTime;
	/**
	 * 应答/错误代码
	 */
	private String RspCode;
	/**
	 * 应答/错误描述代码
	 */
	private String RspDesc;
	
	public Header() {}
	
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
}
