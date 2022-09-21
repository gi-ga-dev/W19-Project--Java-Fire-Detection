package com.gigadev.firedetection;

public class Main {
		
	public static void main(String[] args) {
				
		// inizializzo centro di controllo da inserire nella lista degli observer
		Observer observer1 = new ControlCenterImpl((long) 1);
		
		//ControlCenterImpl control1 = new ControlCenterImpl((long) 1);
		
		SmokeDetectorImpl detector1 = new SmokeDetectorImpl((long) 1, 99.9, 33.3, 0.0);
		detector1.addObserver(observer1);
		
		detector1.detectFire();				 // output 0.0
		detector1.setSmokeParticles(1001.0); 
		detector1.detectFire();				 // output 1001.0 --> trigger alarm
				
	}

}
