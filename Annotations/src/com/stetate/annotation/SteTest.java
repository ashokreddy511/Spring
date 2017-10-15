package com.stetate.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SteTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/stetate/annotation/application-context.xml");
		Radio radio = context.getBean("radio", Radio.class);
		System.out.println(radio.getFrequency());
	}
}
