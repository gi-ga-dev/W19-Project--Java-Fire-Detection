package com.gigadev.firedetection;

public class ControlCenterFactory {
	
	public ControlCenter createControlCenter(Long id) {
		return new ControlCenterImpl(id);
	}

}
