package com.springframework.sun;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
	
	@Test
	public void testIoc() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		FirstBean firstBean = applicationContext.getBean("firstBean", FirstBean.class);
		System.out.println("姓名：" + firstBean.getName());
		System.out.println("年龄：" + firstBean.getAge());
	}
	
}
