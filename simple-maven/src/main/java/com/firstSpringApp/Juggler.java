package com.firstSpringApp;

public class Juggler  implements Perfomer{
	private int numOfRings = 3;
	
	public int getNumOfRings() {
		return numOfRings;
	}


	/**
	 * @param numOfRings
	 */
	public Juggler(int numOfRings) {
		super();
		this.numOfRings = numOfRings;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfRings;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juggler other = (Juggler) obj;
		if (numOfRings != other.numOfRings)
			return false;
		return true;
	}


	public void setNumOfRings(int numOfRings) {
		this.numOfRings = numOfRings;
	}

	/**
	 * 
	 */
	public Juggler() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Juggler [numOfRings=" + numOfRings + "]";
	}


	public void perform() {
		
		System.out.print("Never give up  ");
	}
	

}
