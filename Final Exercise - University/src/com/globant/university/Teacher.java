package com.globant.university;

public class Teacher extends Person implements TeacherType{
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