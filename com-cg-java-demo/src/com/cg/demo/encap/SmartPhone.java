  
package com.cg.demo.encap;

public class SmartPhone extends FeaturePhone {

	void camera() {
		System.out.println("Snap pics...");
	}

	@Override
	void music() {
		System.out.println("Playing Dolby music...");
	}
}