package com.reality.scout.tstub.inter.facade;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reality.scout.tstub.boss.inter.InterFacade;
import com.reality.scout.tstub.inter.Inter2;
import com.reality.scout.tstub.inter.context.BeanHolder;

public class InterFacadeImpl2 implements InterFacade {

	private static final Map<String, InterRegular> interMap = new HashMap<String, InterRegular>();
	
	static {
		interMap.put("<ActivityCode>(.*?)</ActivityCode>", new InterRegular(new String[] {
				"<Sign>(.*?)</Sign>"
		}, new String[] {
				"<MSISDN>([0-9]*?)</MSISDN>", "<Msisdn>([0-9]*?)</Msisdn>"	
		}));
	}
	
	@Override
	public String handle(HttpServletRequest request, HttpServletResponse response) {
		String xmlhead = request.getParameter("xmlhead");
		String xmlbody = request.getParameter("xmlbody");
		String xmlsign = request.getParameter("xmlsign");
		String inter = null;
		String version = null;
		String index = null;
		for (Iterator<Entry<String, InterRegular>> iterator = interMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, InterRegular> entry = iterator.next();
			Pattern pattern = Pattern.compile(entry.getKey());
	        Matcher m = pattern.matcher(xmlhead);
	        while (m.find()) {
	        	inter = m.group(1);
	        	InterRegular InterRegular = entry.getValue();
	        	for (String v : InterRegular.getVersion()) {
	        		Pattern pattern2 = Pattern.compile(v);
	        		if (xmlsign != null) {
	        			Matcher m2 = pattern2.matcher(xmlsign);
						while (m2.find()) {
							version = m2.group(1);
							break;
						}
					}
				}
	        	for (String i : InterRegular.getIndex()) {
	        		Pattern pattern2 = Pattern.compile(i);
	        		if (xmlsign != null) {
	        			Matcher m2 = pattern2.matcher(xmlbody);
						while (m2.find()) {
							index = m2.group(1);
							break;
						}
					}
				}
	        	break;
			}
	        if (inter != null) {
				break;
			}
		}
		Inter2 inter2 = null;
		Map<String, Inter2> beanMap = BeanHolder.getInstance().findBeanForType(Inter2.class);
		inter2 = beanMap.get(inter);
		return inter2 == null ? null : inter2.response(version, index);
	}
	
	private static class InterRegular {
		
		private String[] version;
		
		private String[] index;

		public InterRegular(String[] version, String[] index) {
			super();
			this.version = version;
			this.index = index;
		}

		public String[] getVersion() {
			return version;
		}

		public void setVersion(String[] version) {
			this.version = version;
		}

		public String[] getIndex() {
			return index;
		}

		public void setIndex(String[] index) {
			this.index = index;
		}
	}
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("<MSISDN>([0-9]*?)</MSISDN>");
        Matcher m = pattern.matcher("dfgsrd<MSISDN>15220086754</MSISDN>agr");
        while (m.find()) {
        	System.out.println(m.group(1));
		}
	}

}
