package com.spring.Nagaraj;

import org.springframework.stereotype.Component;

@Component
public class Tyre
{
   private String brand;
   

/**
 * @param brand
 */
//public Tyre(String brand) {  // constructor injection
//	super();
//	this.brand = brand;
//}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {   //  called as Setter Injection because we use property element 
	//in bean tag to inject the  Dependency 
	
	this.brand = brand;
}
   //to display the data of the tyre: we use To string method

@Override
public String toString() {
	return "Tyre";  //  remove the [brand=" + brand + "] 

}



   
}
