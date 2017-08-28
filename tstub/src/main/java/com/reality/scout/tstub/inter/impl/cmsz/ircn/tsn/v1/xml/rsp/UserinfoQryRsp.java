package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.rsp;

import com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml.ServParamInfo;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 业务查询应答信息 （用户基本信息查询响应）
 * @author mengchao
 *
 */
@XStreamAlias(value = "userinfoQryRsp")
public class UserinfoQryRsp {

	/**
	 * 业务查询应答流水号
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
	 * 业务查询应答信息
	 */
	private SubscriptionInfo subscriptionInfo;
	
	public UserinfoQryRsp() {
		subscriptionInfo = new SubscriptionInfo();
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
	public SubscriptionInfo getSubscriptionInfo() {
		return subscriptionInfo;
	}
	public void setSubscriptionInfo(SubscriptionInfo subscriptionInfo) {
		this.subscriptionInfo = subscriptionInfo;
	}
	/**
	 * 业务查询应答信息
	 * @author mengchao
	 *
	 */
	public static class SubscriptionInfo {
		/**
		 * 手机号码
		 */
		private String MSISDN;
		/**
		 * 省代码
		 */
		private String ProvCode;
		/**
		 * 操作时间
		 */
		private String oprTIMSI;
		/**
		 * 国际移动用户身份识别号
		 */
		private String IMSI;
		/**
		 * IMSI号生效时间
		 */
		private String EffTIMSI;
		/**
		 * 用户品牌
		 */
		private String brand;
		/**
		 * 用户付费类型
		 */
		private String userType;
		/**
		 * 用户星级
		 */
		private String level;
		/**
		 * 用户状态
		 */
		private String Userstat;
		/**
		 * 用户国漫服务开通状态
		 */
		private String InterRoamFuncstat;
		/**
		 * 服务类型
		 */
		private String servType;
		/**
		 * 国漫开通生效时间
		 */
		@XStreamAlias(value = "effTIMSI")
		private String effTIMSI2;
		/**
		 * 国漫开通失效时间
		 */
		private String ValidityDate;
		/**
		 * 用户是否为黑名单用户
		 */
		private String IsBlacklist;
		/**
		 * 是否需要余额判断
		 */
		private String IsBalanceJud;
		/**
		 * 帐户余额
		 */
		private String Userbalance;
		/**
		 * 用户国际长途开通状态
		 */
		private String IDDFuncstat;
		/**
		 * 服务类型
		 */
		private String IDDServType;
		/**
		 * 国际长途开通生效时间
		 */
		private String IDDEffTIMSI;
		/**
		 * 国际长途开通失效时间
		 */
		private String IDDValidityDate;
		/**
		 * 业务受理信息
		 */
		private ServParamInfo servParamInfo;
		
		public SubscriptionInfo() {
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
		public String getEffTIMSI2() {
			return effTIMSI2;
		}
		public void setEffTIMSI2(String effTIMSI2) {
			this.effTIMSI2 = effTIMSI2;
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
		public String getLevel() {
			return level;
		}
		public void setLevel(String level) {
			this.level = level;
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
		public String getIsBalanceJud() {
			return IsBalanceJud;
		}
		public void setIsBalanceJud(String isBalanceJud) {
			IsBalanceJud = isBalanceJud;
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
		public ServParamInfo getServParamInfo() {
			return servParamInfo;
		}
		public void setServParamInfo(ServParamInfo servParamInfo) {
			this.servParamInfo = servParamInfo;
		}
	}
}
