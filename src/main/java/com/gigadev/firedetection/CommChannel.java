package com.gigadev.firedetection;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class CommChannel {
	
	// il canale serve solo per inviare la comunicazione
	private static final String baseUrl = "http://host/alarm";	
	
	public void sendComm(SmokeDetectorImpl detector) {
		log.info("Alarm smoke detector n. " + detector.getId() + " latitude: " + detector.getLatitude() + " longitude: " + detector.getLongitude() + " smoke particles detected: " + detector.getSmokeParticles());
		String completeUrl = baseUrl + "?=idDetector=" + detector.getId() + "&lat=" + detector.getLatitude() + "&lon=" + detector.getLongitude() + "&smokelevel=" + detector.getSmokeParticles();
		log.info("Authorized personnel has been alerted! Refer to: " + completeUrl);
	}	
	
}
