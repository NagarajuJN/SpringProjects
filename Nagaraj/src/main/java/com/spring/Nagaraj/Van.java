package com.spring.Nagaraj;

import org.springframework.stereotype.Component;

@Component
public class Van implements Vehicle
{

	public void drive()
	{
		System.out.print(" Van is Moving ...");
	}
}
