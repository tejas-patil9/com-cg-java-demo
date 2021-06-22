package com.cg.demo.enumDemo;

public enum State {
//	MAHARASHTRA, TELANGANA, KARNATAKA, GUJRAT 

	MAHARASHTRA("MH"), TELANGANA("TS"), KARNATAKA("KA"), GUJRAT("GJ");

	public final String stateCode;

	State(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateCode() {
		return stateCode;
	}
}
