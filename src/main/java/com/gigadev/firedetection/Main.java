package com.gigadev.firedetection;

public class Main {
		
	public static void main(String[] args) {
				
		// SmokeDetectorFactory detectorFactory = new SmokeDetectorFactory();
		// **oggetto identico a detector1 ma senza variabile**	
		// detectorFactory.createSmokeDetector((long) 1, 99.9, 33.3, 0.0);
		
		ControlCenterFactory controlFactory = new ControlCenterFactory();		
		SmokeDetectorImpl detector1 = new SmokeDetectorImpl((long) 1, 99.9, 33.3, 0.0);
		
		// inizializzo centro di controllo da inserire nella lista degli observer
		detector1.addObserver((Observer) controlFactory.createControlCenter());	
		
		// ======== Fire Test ========
		
		detector1.detectFire();				 // output 0.0
		detector1.setSmokeParticles(1001.0); 
		detector1.detectFire();				 // output 1001.0 --> trigger alarm
				
	}

}
