package com.globant.university;

public class Teacher extends Person{
	private double salary;
	private boolean isFullTime;

	public Teacher(double salary) {
		super();
		this.salary = salary;

	}
	public boolean getIsFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
}
