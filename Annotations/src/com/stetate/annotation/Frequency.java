package com.stetate.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Frequency {
	@Value("#{prop.classname_attribute}")
	private int frequency;
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Frequency [frequency=" + frequency + "]";
	}
	
	
}
