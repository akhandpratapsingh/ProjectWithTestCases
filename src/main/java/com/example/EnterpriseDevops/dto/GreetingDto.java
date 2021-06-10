package com.example.EnterpriseDevops.dto;

public class GreetingDto {

	private String name;
	private String day;

	public GreetingDto(String name, String day) {
		this.name = name;
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
