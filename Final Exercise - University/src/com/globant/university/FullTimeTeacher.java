package com.globant.university;

public class FullTimeTeacher extends Person implements Teacher{
	
	private double totalSalary;
	private int experienceYears;

	public FullTimeTeacher(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		totalSalary = baseSalary * (1.1 * experienceYears);
	}

	@Override
	public void showTeacherData() {
		// TODO Auto-generated method stub
		System.out.println("Partial Time Teacher: "+getName()+"\nSalary: "+totalSalary+"\nExperience years: "+experienceYears+"\n");
	}
	
	
	
	
}