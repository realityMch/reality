package com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1.util;

import com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1.entity.Common;
import com.reality.scout.tstub.inter.impl.cmsz.ircn.issp.v1.xml.Header;

public class POJOHelper {

	public static Header setHeader(Common common) {
		Header header = new Header();
		header.setActivityCode(common.getActivityCode());
		header.setReqSys(common.getReqSys());
		header.setReqDate(common.getReqDate());
		header.setReqTransID(common.getReqTransID());
		header.setReqDateTime(common.getReqDateTime());
		header.setActionCode(common.getActionCode());
		header.setRcvSys(common.getRcvSys());
		header.setRcvDate(common.getRcvDate());
		header.setRcvTransID(common.getRcvTransID());
		header.setRcvDateTime(common.getRcvDateTime());
		header.setRspCode(common.getRspCode());
		header.setRspDesc(common.getRspDesc());
		return header;
	}
}
