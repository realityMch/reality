package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = "InterBOSS")
public class InterBOSS {

	/**
	 * 报文版本号
	 */
	private String Version;
	/**
	 * 测试标记
	 */
	private String TestFlag;
	/**
	 * 交易类型信息
	 */
	private BIPType BIPType;
	/**
	 * 交易路由信息
	 */
	private RoutingInfo RoutingInfo;
	/**
	 * 交易流水信息
	 */
	private TransInfo TransInfo;
	/**
	 * 机构不填，SN保留信息
	 */
	private SNReserve SNReserve;
	/**
	 * 应答节点
	 */
	private Response Response;
	/**
	 * 业务应答内容
	 */
	private String SvcCont;
	
	public InterBOSS() {
		BIPType = new BIPType();
		RoutingInfo = new RoutingInfo();
		TransInfo = new TransInfo();
		SNReserve = new SNReserve();
		Response = new Response();
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
	public BIPType getBIPType() {
		return BIPType;
	}
	public void setBIPType(BIPType bIPType) {
		BIPType = bIPType;
	}
	public RoutingInfo getRoutingInfo() {
		return RoutingInfo;
	}
	public void setRoutingInfo(RoutingInfo routingInfo) {
		RoutingInfo = routingInfo;
	}
	public TransInfo getTransInfo() {
		return TransInfo;
	}
	public void setTransInfo(TransInfo transInfo) {
		TransInfo = transInfo;
	}
	public SNReserve getSNReserve() {
		return SNReserve;
	}
	public void setSNReserve(SNReserve sNReserve) {
		SNReserve = sNReserve;
	}
	public Response getResponse() {
		return Response;
	}
	public void setResponse(Response response) {
		Response = response;
	}
	public String getSvcCont() {
		return SvcCont;
	}
	public void setSvcCont(String svcCont) {
		SvcCont = svcCont;
	}
	/**
	 * 交易类型信息
	 * @author mengchao
	 *
	 */
	public static class BIPType {
		/**
		 * 业务功能代码
		 */
		private String BIPCode;
		/**
		 * 交易代码
		 */
		private String ActivityCode;
		/**
		 * 交易动作代码
		 */
		private String ActionCode;
		
		public BIPType() {}
		
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
	}
	/**
	 * 交易路由信息
	 * @author mengchao
	 *
	 */
	public static class RoutingInfo {
		/**
		 * 发起方应用域代码
		 */
		private String OrigDomain;
		/**
		 * 路由类型
		 */
		private String RouteType;
		/**
		 * 路由信息
		 */
		private Routing Routing;
		
		public RoutingInfo() {
			Routing = new Routing();
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

		public Routing getRouting() {
			return Routing;
		}

		public void setRouting(Routing routing) {
			Routing = routing;
		}

		/**
		 * 路由信息
		 * @author mengchao
		 *
		 */
		public static class Routing {
			/**
			 * 归属方应用域代码
			 */
			private String HomeDomain;
			/**
			 * 路由关键值
			 */
			private String RouteValue;
			
			public Routing() {}
			
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
		}
	}
	/**
	 * 交易流水信息
	 * @author mengchao
	 *
	 */
	public static class TransInfo {
		/**
		 * 业务流水号
		 */
		private String SessionID;
		/**
		 * 发起方交易流水号
		 */
		private String TransIDO;
		/**
		 * 处理时间
		 */
		private String TransIDOTime;
		/**
		 * 落地方交易流水号
		 */
		private String TransIDH;
		/**
		 * 处理时间
		 */
		private String TransIDHTime;
		
		public TransInfo() {}
		
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
		
	}
	/**
	 * 机构不填，SN保留信息
	 * @author mengchao
	 *
	 */
	public static class SNReserve {
		/**
		 * SN交易流水号
		 */
		private String TransIDC;
		/**
		 * SN处理标识
		 */
		private String ConvID;
		/**
		 * 日切点
		 */
		private String CutOffDay;
		/**
		 * 处理时间
		 */
		private String OSNTime;
		/**
		 * 发起方交换节点代码
		 */
		private String OSNDUNS;
		/**
		 * 归属方交换节点代码
		 */
		private String HSNDUNS;
		/**
		 * 发起方机构编码
		 */
		private String MsgSender;
		/**
		 * 归属方机构编码
		 */
		private String MsgReceiver;
		/**
		 * 交易优先级
		 */
		private String Priority;
		/**
		 * 服务级别
		 */
		private String ServiceLevel;
		/**
		 * 报文体类型
		 */
		private String SvcContType;
		
		public SNReserve() {}
		
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
		
	}
	/**
	 * 应答节点
	 * @author mengchao
	 *
	 */
	public static class Response {
		/**
		 * 应答/错误类型
		 */
		private String RspType;
		/**
		 * 应答/错误代码
		 */
		private String RspCode;
		/**
		 * 应答/错误描述
		 */
		private String RspDesc;

		public Response() {}

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

	}
}
