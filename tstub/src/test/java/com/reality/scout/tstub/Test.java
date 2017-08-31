package com.reality.scout.tstub;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Test {
	

	public static void main(String[] args) {
		Map<Integer, Vector<String>> map = new HashMap<>();
		try {
			char[] c = {0x4E00};
			while (c[0] < 0x9FCB) {
				String unicode = new String(c);
				String hz = new String(unicode.getBytes("UTF-8"),"UTF-8");
				Integer length = HanDict.getBH(hz).length();
				if (map.get(length) != null) {
					map.get(length).add(hz);
				} else {
					Vector<String> vector = new Vector<>();
					vector.add(hz);
					map.put(length, vector);
				}
				c[0]++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		for (String string : map.get(2)) {
//			
//			System.out.println(string);
//		}
		System.out.println(map.get(10).size());
	}
}
