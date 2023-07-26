package com.spring.Nagaraj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   // Annotation based configuration

public class Bus  implements Vehicle

{
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



public void drive()
{
	System.out.print("Bus is moving... with a  tyre named called "+tyre);
}
}
