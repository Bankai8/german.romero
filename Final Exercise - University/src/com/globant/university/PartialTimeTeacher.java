package com.globant.university;


public class PartialTimeTeacher extends Person implements Teacher{

	private double hourSalary;
	private double totalSalary;
	private int workedHours;
	private int experienceYears;

	public PartialTimeTeacher(int experienceYears,int workedHours) {
		// 30 is for days of the month - 8 is for hours of work
		hourSalary = (baseSalary / 30)/8;
		this.experienceYears = experienceYears;
		this.workedHours = workedHours;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		totalSalary = hourSalary * workedHours;
	}


	@Override
	public void showTeacherData() {
		// TODO Auto-generated method stub
		System.out.println("Partial Time Teacher: "+getName()+"\nSalary: "+totalSalary+" Worked hours: "+workedHours+"\nExperience years: "+experienceYears+"\n");
	}


	
}