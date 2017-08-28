package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp;
/**
 * 业务查询应答信息（国漫功能开通/关闭响应）
 * @author mengchao
 *
 */

import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.ServParamInfo;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = "InterRoamFuncManageRsp")
public class InterRoamFuncManageRsp {

	/**
	 * 业务应答流水号
	 */
	private String msgTransactionID;
	/**
	 * 处理结果码
	 */
	private String cfmResultCode;
	/**
	 * 处理结果描述
	 */
	private String cfmResultCodeDesc;
	/**
	 * 业务应答详细信息
	 */
	private InterRoamInfo InterRoamInfo;
	
	public InterRoamFuncManageRsp() {
		InterRoamInfo = new InterRoamInfo();
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


	public InterRoamInfo getInterRoamInfo() {
		return InterRoamInfo;
	}


	public void setInterRoamInfo(InterRoamInfo interRoamInfo) {
		InterRoamInfo = interRoamInfo;
	}


	/**
	 * 业务应答详细信息
	 * @author mengchao
	 *
	 */
	public static class InterRoamInfo {
		/**
		 * 手机号码
		 */
		private String MSISDN;
		/**
		 * 省代码
		 */
		private String ProvCode;
		/**
		 * 省boss操作处理时间
		 */
		private String oprTIMSI;
		/**
		 * 服务类型
		 */
		private String servType;
		/**
		 * 操作类型
		 */
		private String actionID;
		/**
		 * 服务开通/关闭生效时间
		 */
		private String effTIMSI;
		/**
		 * 服务开通失效时间
		 */
		private String expTIMSI;
		/**
		 * 业务受理信息
		 */
		private ServParamInfo servParamInfo;
		
		public InterRoamInfo() {
			servParamInfo = new ServParamInfo();
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

		public ServParamInfo getServParamInfo() {
			return servParamInfo;
		}

		public void setServParamInfo(ServParamInfo servParamInfo) {
			this.servParamInfo = servParamInfo;
		}

	}
}
