package com.reality.scout.tstub.inter.impl.cmsz.ircn.entity;

import javax.persistence.Entity;

@Entity(name = "tstub_ircnuser")
public class IrcnUser {
	
	private boolean flag;

	private String MSISDN;
	
	private String ProvCode;
	
	private String oprTIMSI;
	
	private String IMSI;
	
	private String EffTIMSI;
	
	private String brand;
	
	private String userType;
	
	private String col_level;
	
	private String Userstat;
	
	private String InterRoamFuncstat;
	
	private String servType;
	
	private String effTIMSI2;
	
	private String ValidityDate;
	
	private String IsBlacklist;
	
	private String Userbalance;
	
	private String IDDFuncstat;
	
	private String IDDServType;
	
	private String IDDEffTIMSI;
	
	private String IDDValidityDate;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
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

	public String getIMSI() {
		return IMSI;
	}

	public void setIMSI(String iMSI) {
		IMSI = iMSI;
	}

	public String getEffTIMSI() {
		return EffTIMSI;
	}

	public void setEffTIMSI(String effTIMSI) {
		EffTIMSI = effTIMSI;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCol_level() {
		return col_level;
	}

	public void setCol_level(String col_level) {
		this.col_level = col_level;
	}

	public String getUserstat() {
		return Userstat;
	}

	public void setUserstat(String userstat) {
		Userstat = userstat;
	}

	public String getInterRoamFuncstat() {
		return InterRoamFuncstat;
	}

	public void setInterRoamFuncstat(String interRoamFuncstat) {
		InterRoamFuncstat = interRoamFuncstat;
	}

	public String getServType() {
		return servType;
	}

	public void setServType(String servType) {
		this.servType = servType;
	}

	public String getEffTIMSI2() {
		return effTIMSI2;
	}

	public void setEffTIMSI2(String effTIMSI2) {
		this.effTIMSI2 = effTIMSI2;
	}

	public String getValidityDate() {
		return ValidityDate;
	}

	public void setValidityDate(String validityDate) {
		ValidityDate = validityDate;
	}

	public String getIsBlacklist() {
		return IsBlacklist;
	}

	public void setIsBlacklist(String isBlacklist) {
		IsBlacklist = isBlacklist;
	}

	public String getUserbalance() {
		return Userbalance;
	}

	public void setUserbalance(String userbalance) {
		Userbalance = userbalance;
	}

	public String getIDDFuncstat() {
		return IDDFuncstat;
	}

	public void setIDDFuncstat(String iDDFuncstat) {
		IDDFuncstat = iDDFuncstat;
	}

	public String getIDDServType() {
		return IDDServType;
	}

	public void setIDDServType(String iDDServType) {
		IDDServType = iDDServType;
	}

	public String getIDDEffTIMSI() {
		return IDDEffTIMSI;
	}

	public void setIDDEffTIMSI(String iDDEffTIMSI) {
		IDDEffTIMSI = iDDEffTIMSI;
	}

	public String getIDDValidityDate() {
		return IDDValidityDate;
	}

	public void setIDDValidityDate(String iDDValidityDate) {
		IDDValidityDate = iDDValidityDate;
	}

}
