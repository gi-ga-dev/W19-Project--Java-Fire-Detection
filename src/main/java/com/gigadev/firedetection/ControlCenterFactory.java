package com.gigadev.firedetection;

public class ControlCenterFactory {
	
	public ControlCenter createControlCenter() {
		return new ControlCenterImpl();
	}

}
