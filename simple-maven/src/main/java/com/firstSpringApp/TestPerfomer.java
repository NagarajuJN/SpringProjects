package com.firstSpringApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.suport.ClassPathXmlApplicationContext;

public class TestPerfomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
			System.out.print("bean loaded");
	}

}
