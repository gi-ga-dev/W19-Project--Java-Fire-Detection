package com.gigadev.firedetection;

public class SmokeDetectorFactory {
	
	public SmokeDetector createSmokeDetector(Long id, Double latitude, Double longitude, Double smokeParticles) {
		return new SmokeDetectorImpl(id, latitude, longitude, smokeParticles);		
	}

}
