package com.globant.university;

public class Student extends Person{

	public Student(String name,int id, int age) {
		setName(name);
		setId(id);
		setAge(age);
	}
	public void showStudentData() {
		System.out.println("Student: "+getName()+"\nId: "+getId()+"\nAge: "+getAge()+"\n");
	}
}
