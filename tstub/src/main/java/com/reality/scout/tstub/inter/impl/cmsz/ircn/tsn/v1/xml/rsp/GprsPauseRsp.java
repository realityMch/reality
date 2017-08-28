package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp;
/**
 * 
 * @author mengchao
 *
 */

import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.ServParamInfo;
import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * 业务应答信息（数据功能暂停/恢复响应）
 * @author mengchao
 *
 */
@XStreamAlias(value = "gprsPauseRsp")
public class GprsPauseRsp {

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
	 * 业务暂停/恢复信息
	 */
	private GprsPauseInfo gprsPauseInfo;
	
	public GprsPauseRsp() {
		gprsPauseInfo = new GprsPauseInfo();
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

	public GprsPauseInfo getGprsPauseInfo() {
		return gprsPauseInfo;
	}

	public void setGprsPauseInfo(GprsPauseInfo gprsPauseInfo) {
		this.gprsPauseInfo = gprsPauseInfo;
	}

	/**
	 * 业务暂停/恢复信息
	 * @author mengchao
	 *
	 */
	public static class GprsPauseInfo {
		/**
		 * 手机号码
		 */
		private String MSISDN;
		/**
		 * 省代码
		 */
		private String ProvCode;
		/**
		 * 省boss服务功能暂停/恢复处理时间
		 */
		private String oprTIMSI;
		/**
		 * 服务类型
		 */
		private String servType;
		/**
		 * 	服务暂停/恢复生效时间
		 */
		private String effTIMSI;
		/**
		 * 业务受理信息
		 */
		private ServParamInfo servParamInfo;
		
		public GprsPauseInfo() {
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

		public String getEffTIMSI() {
			return effTIMSI;
		}

		public void setEffTIMSI(String effTIMSI) {
			this.effTIMSI = effTIMSI;
		}

		public ServParamInfo getServParamInfo() {
			return servParamInfo;
		}

		public void setServParamInfo(ServParamInfo servParamInfo) {
			this.servParamInfo = servParamInfo;
		}

	}
}
