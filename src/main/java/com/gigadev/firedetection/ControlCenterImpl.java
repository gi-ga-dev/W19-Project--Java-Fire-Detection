package com.gigadev.firedetection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControlCenterImpl implements ControlCenter, Observer {
	
	private Long id;
	private CommChannel commChannel = new CommChannel();
	
	@Override
	public void alertPersonnel(SmokeDetectorImpl detector) {
		commChannel.sendComm(detector);
	}			

	@Override
	public void update(Subject detector) {
		alertPersonnel((SmokeDetectorImpl) detector);		
	}

	public ControlCenterImpl(Long id) {
		super();
		this.id = id;
	}

}
