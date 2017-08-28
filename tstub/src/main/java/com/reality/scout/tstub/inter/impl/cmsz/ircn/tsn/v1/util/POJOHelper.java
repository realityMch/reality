package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.util;

import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.entity.Common;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.InterBOSS;

public class POJOHelper {

	public static InterBOSS setInterBOSS(Common common) {
		InterBOSS interBOSS = new InterBOSS();
		interBOSS.setVersion(common.getVersion());
		interBOSS.setTestFlag(common.getTestFlag());
		if (common.getBIPType() == null) {
			interBOSS.setBIPType(null);
		} else {
			interBOSS.getBIPType().setBIPCode(common.getBIPCode());
			interBOSS.getBIPType().setActivityCode(common.getActivityCode());
			interBOSS.getBIPType().setActionCode(common.getActionCode());
		}
		if (common.getRoutingInfo() == null) {
			interBOSS.setRoutingInfo(null);
		} else {
			interBOSS.getRoutingInfo().setOrigDomain(common.getOrigDomain());
			interBOSS.getRoutingInfo().setRouteType(common.getRouteType());
			if (common.getRouting() == null) {
				interBOSS.getRoutingInfo().setRouting(null);
			} else {
				interBOSS.getRoutingInfo().getRouting().setHomeDomain(common.getHomeDomain());
				interBOSS.getRoutingInfo().getRouting().setRouteValue(common.getRouteValue());
			}
		}
		if (common.getTransInfo() == null) {
			interBOSS.setTransInfo(null);
		} else {
			interBOSS.getTransInfo().setSessionID(common.getSessionID());
			interBOSS.getTransInfo().setTransIDO(common.getTransIDO());
			interBOSS.getTransInfo().setTransIDOTime(common.getTransIDOTime());
			interBOSS.getTransInfo().setTransIDH(common.getTransIDH());
			interBOSS.getTransInfo().setTransIDHTime(common.getTransIDHTime());
		}
		if (common.getSNReserve() == null) {
			interBOSS.setSNReserve(null);
		} else {
			interBOSS.getSNReserve().setTransIDC(common.getTransIDC());
			interBOSS.getSNReserve().setConvID(common.getConvID());
			interBOSS.getSNReserve().setCutOffDay(common.getCutOffDay());
			interBOSS.getSNReserve().setOSNTime(common.getOSNTime());
			interBOSS.getSNReserve().setOSNDUNS(common.getOSNDUNS());
			interBOSS.getSNReserve().setMsgSender(common.getMsgSender());
			interBOSS.getSNReserve().setMsgReceiver(common.getMsgReceiver());
			interBOSS.getSNReserve().setPriority(common.getPriority());
			interBOSS.getSNReserve().setServiceLevel(common.getServiceLevel());
			interBOSS.getSNReserve().setSvcContType(common.getSvcContType());
		}
		if (common.getResponse() == null) {
			interBOSS.setResponse(null);
		} else {
			interBOSS.getResponse().setRspType(common.getRspType());
			interBOSS.getResponse().setRspCode(common.getRspCode());
			interBOSS.getResponse().setRspDesc(common.getRspDesc());
		}
		interBOSS.setSvcCont(common.getSvcCont());
		return interBOSS;
	}
}
