package com.gigadev.firedetection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class SmokeDetectorImpl extends Subject implements SmokeDetector {
	
	private Long id;
	private Double latitude;
	private Double longitude;	
	private Double smokeParticles;
	
	@Override
	public void detectFire() { 
		if(smokeParticles > 1000.0) { 
			alertObservers(); 
		} else log.info("Values are below 1000.0, All good my friend! :)");
	}
	
	
}
