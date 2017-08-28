package com.reality.scout.tstub.inter.context;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanHolder {

	private static ApplicationContext act;
	
	private BeanHolder() {
		act = new ClassPathXmlApplicationContext("classpath:inter/applicationContext.xml");
	}
	
	private static class SingletonHolder {
		private static final BeanHolder INSTANCE = new BeanHolder();
	}
	
	public static final BeanHolder getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public Object findBean(String name) {
		return act.getBean(name);
	}
	
	public <T> Map<String, T> findBeanForType(Class<T> type) {
		return act.getBeansOfType(type);
	}
}
