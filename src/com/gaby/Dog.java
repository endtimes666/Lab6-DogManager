package com.gaby;

import java.util.HashMap;

public class Dog {

	private String name;
	private String address;
	HashMap<String, Integer> schedule;

	public HashMap<String, Integer> getSchedule() {
		return schedule;
	}

	public void setSchedule(HashMap<String, Integer> schedule) {
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}