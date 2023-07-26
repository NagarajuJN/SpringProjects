package com.spring.Nagaraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml"); //  because it implements the  interface ApplicationContext .

    // creating the Interface to resolve the above problem
    	
//    				Vehicle obj = (Vehicle)context.getBean("bus");  // typecasting to vehicle
//    				obj.drive();
//    	
//    	Tyre t = new Tyre(); we need to add some dependencies so we use spring inbuilt method getBean by type casting to Tyre
    // but we did'nt mention the tyre in xml configurations
//    
//    Tyre t = (Tyre)context.getBean("tyre");
//    System.out.println(t); 
    	
    	Bus obj = (Bus)context.getBean("bus");
    	obj.drive();
    	
    }
}
