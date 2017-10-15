package com.stetate.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="radio")
public class Radio {
	@Autowired
	private Frequency frequency;

	public Frequency getFrequency() {
		return frequency;
	}

	
	

}
