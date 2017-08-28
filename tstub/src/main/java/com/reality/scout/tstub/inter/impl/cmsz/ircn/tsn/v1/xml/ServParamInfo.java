package com.reality.scout.tstub.inter.impl.cmsz.ircn.tsn.v1.xml;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
/**
 * 业务受理信息
 * @author mengchao
 *
 */
@XStreamAlias(value = "servParamInfo")
public class ServParamInfo {
	/**
	 * 参数的个数
	 */
	private String para_num;
	/**
	 * 参数信息
	 */
	@XStreamImplicit
	private List<Para_info> para_info;
	
	public ServParamInfo() {
		para_info = new ArrayList<Para_info>();
	}

	public String getPara_num() {
		return para_num;
	}

	public void setPara_num(String para_num) {
		this.para_num = para_num;
	}

	public List<Para_info> getPara_info() {
		return para_info;
	}

	public void setPara_info(List<Para_info> para_info) {
		this.para_info = para_info;
	}

	/**
	 * 参数信息
	 * @author mengchao
	 *
	 */
	@XStreamAlias(value = "para_info")
	public static class Para_info {
		/**
		 * 参数名称
		 */
		private String para_name;
		/**
		 * 参数值
		 */
		private String para_value;

		public Para_info() {}

		public String getPara_name() {
			return para_name;
		}

		public void setPara_name(String para_name) {
			this.para_name = para_name;
		}

		public String getPara_value() {
			return para_value;
		}

		public void setPara_value(String para_value) {
			this.para_value = para_value;
		}
	}
}
