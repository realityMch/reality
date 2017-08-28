package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.rsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tstub_tsn_v1_rsp_T3000321")
public class T3000321 {

	@Id
	private String ID;
	
	private String SvcCont;
	
	private String IDDFuncManageRsp;
	
	private String msgTransactionID;
	
	private String cfmResultCode;
	
	private String cfmResultCodeDesc;
	
	private String IDDInfo;
	
	private String MSISDN;
	
	private String ProvCode;
	
	private String oprTIMSI;
	
	private String servType;
	
	private String actionID;
	
	private String effTIMSI;
	
	private String expTIMSI;
	
	private String servParamInfo;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSvcCont() {
		return SvcCont;
	}

	public void setSvcCont(String svcCont) {
		SvcCont = svcCont;
	}

	public String getIDDFuncManageRsp() {
		return IDDFuncManageRsp;
	}

	public void setIDDFuncManageRsp(String iDDFuncManageRsp) {
		IDDFuncManageRsp = iDDFuncManageRsp;
	}

	public String getMsgTransactionID() {
		return msgTransactionID;
	}

	public void setMsgTransactionID(String msgTransactionID) {
		this.msgTransactionID = msgTransactionID;
	}

	public String getCfmResultCode() {
		return cfmResultCode;
	}

	public void setCfmResultCode(String cfmResultCode) {
		this.cfmResultCode = cfmResultCode;
	}

	public String getCfmResultCodeDesc() {
		return cfmResultCodeDesc;
	}

	public void setCfmResultCodeDesc(String cfmResultCodeDesc) {
		this.cfmResultCodeDesc = cfmResultCodeDesc;
	}

	public String getIDDInfo() {
		return IDDInfo;
	}

	public void setIDDInfo(String iDDInfo) {
		IDDInfo = iDDInfo;
	}

	public String getMSISDN() {
		return MSISDN;
	}

	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}

	public String getProvCode() {
		return ProvCode;
	}

	public void setProvCode(String provCode) {
		ProvCode = provCode;
	}

	public String getOprTIMSI() {
		return oprTIMSI;
	}

	public void setOprTIMSI(String oprTIMSI) {
		this.oprTIMSI = oprTIMSI;
	}

	public String getServType() {
		return servType;
	}

	public void setServType(String servType) {
		this.servType = servType;
	}

	public String getActionID() {
		return actionID;
	}

	public void setActionID(String actionID) {
		this.actionID = actionID;
	}

	public String getEffTIMSI() {
		return effTIMSI;
	}

	public void setEffTIMSI(String effTIMSI) {
		this.effTIMSI = effTIMSI;
	}

	public String getExpTIMSI() {
		return expTIMSI;
	}

	public void setExpTIMSI(String expTIMSI) {
		this.expTIMSI = expTIMSI;
	}

	public String getServParamInfo() {
		return servParamInfo;
	}

	public void setServParamInfo(String servParamInfo) {
		this.servParamInfo = servParamInfo;
	}
}
