package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tstub_tsn_v1_common")
public class Common {

	@Id
	private String ID;
	
	private String InterBOSS;
	
	private String Version;
	
	private String TestFlag;
	
	private String BIPType;
	
	private String BIPCode;
	
	private String ActivityCode;
	
	private String ActionCode;
	
	private String RoutingInfo;
	
	private String OrigDomain;
	
	private String RouteType;
	
	private String Routing;
	
	private String HomeDomain;
	
	private String RouteValue;
	
	private String TransInfo;
	
	private String SessionID;
	
	private String TransIDO;
	
	private String TransIDOTime;
	
	private String TransIDH;
	
	private String TransIDHTime;
	
	private String SNReserve;
	
	private String TransIDC;
	
	private String ConvID;
	
	private String CutOffDay;
	
	private String OSNTime;
	
	private String OSNDUNS;
	
	private String HSNDUNS;
	
	private String MsgSender;
	
	private String MsgReceiver;
	
	private String Priority;
	
	private String ServiceLevel;
	
	private String SvcContType;
	
	private String Response;
	
	private String RspType;
	
	private String RspCode;
	
	private String RspDesc;
	
	private String SvcCont;
	
	private String common;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getInterBOSS() {
		return InterBOSS;
	}

	public void setInterBOSS(String interBOSS) {
		InterBOSS = interBOSS;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getTestFlag() {
		return TestFlag;
	}

	public void setTestFlag(String testFlag) {
		TestFlag = testFlag;
	}

	public String getBIPType() {
		return BIPType;
	}

	public void setBIPType(String bIPType) {
		BIPType = bIPType;
	}

	public String getBIPCode() {
		return BIPCode;
	}

	public void setBIPCode(String bIPCode) {
		BIPCode = bIPCode;
	}

	public String getActivityCode() {
		return ActivityCode;
	}

	public void setActivityCode(String activityCode) {
		ActivityCode = activityCode;
	}

	public String getActionCode() {
		return ActionCode;
	}

	public void setActionCode(String actionCode) {
		ActionCode = actionCode;
	}

	public String getRoutingInfo() {
		return RoutingInfo;
	}

	public void setRoutingInfo(String routingInfo) {
		RoutingInfo = routingInfo;
	}

	public String getOrigDomain() {
		return OrigDomain;
	}

	public void setOrigDomain(String origDomain) {
		OrigDomain = origDomain;
	}

	public String getRouteType() {
		return RouteType;
	}

	public void setRouteType(String routeType) {
		RouteType = routeType;
	}

	public String getRouting() {
		return Routing;
	}

	public void setRouting(String routing) {
		Routing = routing;
	}

	public String getHomeDomain() {
		return HomeDomain;
	}

	public void setHomeDomain(String homeDomain) {
		HomeDomain = homeDomain;
	}

	public String getRouteValue() {
		return RouteValue;
	}

	public void setRouteValue(String routeValue) {
		RouteValue = routeValue;
	}

	public String getTransInfo() {
		return TransInfo;
	}

	public void setTransInfo(String transInfo) {
		TransInfo = transInfo;
	}

	public String getSessionID() {
		return SessionID;
	}

	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}

	public String getTransIDO() {
		return TransIDO;
	}

	public void setTransIDO(String transIDO) {
		TransIDO = transIDO;
	}

	public String getTransIDOTime() {
		return TransIDOTime;
	}

	public void setTransIDOTime(String transIDOTime) {
		TransIDOTime = transIDOTime;
	}

	public String getTransIDH() {
		return TransIDH;
	}

	public void setTransIDH(String transIDH) {
		TransIDH = transIDH;
	}

	public String getTransIDHTime() {
		return TransIDHTime;
	}

	public void setTransIDHTime(String transIDHTime) {
		TransIDHTime = transIDHTime;
	}

	public String getSNReserve() {
		return SNReserve;
	}

	public void setSNReserve(String sNReserve) {
		SNReserve = sNReserve;
	}

	public String getTransIDC() {
		return TransIDC;
	}

	public void setTransIDC(String transIDC) {
		TransIDC = transIDC;
	}

	public String getConvID() {
		return ConvID;
	}

	public void setConvID(String convID) {
		ConvID = convID;
	}

	public String getCutOffDay() {
		return CutOffDay;
	}

	public void setCutOffDay(String cutOffDay) {
		CutOffDay = cutOffDay;
	}

	public String getOSNTime() {
		return OSNTime;
	}

	public void setOSNTime(String oSNTime) {
		OSNTime = oSNTime;
	}

	public String getOSNDUNS() {
		return OSNDUNS;
	}

	public void setOSNDUNS(String oSNDUNS) {
		OSNDUNS = oSNDUNS;
	}

	public String getHSNDUNS() {
		return HSNDUNS;
	}

	public void setHSNDUNS(String hSNDUNS) {
		HSNDUNS = hSNDUNS;
	}

	public String getMsgSender() {
		return MsgSender;
	}

	public void setMsgSender(String msgSender) {
		MsgSender = msgSender;
	}

	public String getMsgReceiver() {
		return MsgReceiver;
	}

	public void setMsgReceiver(String msgReceiver) {
		MsgReceiver = msgReceiver;
	}

	public String getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public String getServiceLevel() {
		return ServiceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		ServiceLevel = serviceLevel;
	}

	public String getSvcContType() {
		return SvcContType;
	}

	public void setSvcContType(String svcContType) {
		SvcContType = svcContType;
	}

	public String getResponse() {
		return Response;
	}

	public void setResponse(String response) {
		Response = response;
	}

	public String getRspType() {
		return RspType;
	}

	public void setRspType(String rspType) {
		RspType = rspType;
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

	public String getSvcCont() {
		return SvcCont;
	}

	public void setSvcCont(String svcCont) {
		SvcCont = svcCont;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}
}
