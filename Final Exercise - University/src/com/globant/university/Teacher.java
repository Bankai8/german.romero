package com.globant.university;

public class Teacher extends Person implements TeacherType{
	
	private double baseSalary;
	private double semanalSalary;
	private boolean isFullTime;
	private int experienceYears;


	public Teacher(boolean isFullTime,int experienceYears) {
		baseSalary = 1500000;
		semanalSalary = baseSalary / 4;
		this.isFullTime = isFullTime;
		this.experienceYears = experienceYears;
	}

	public boolean getIsFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean teacherTypeTime() {
		// TODO Auto-generated method stub
		return false;
	}
}