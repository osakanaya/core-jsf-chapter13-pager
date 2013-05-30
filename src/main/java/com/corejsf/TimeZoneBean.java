package com.corejsf;

import java.io.Serializable;
import java.util.TimeZone;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("tz")
@RequestScoped
public class TimeZoneBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String[] data = TimeZone.getAvailableIDs();

	public String[] getData() {
		return data;
	}
}
