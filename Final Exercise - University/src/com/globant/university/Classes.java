package com.globant.university;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	
	String className;
	private List<Teacher> teachersList = new ArrayList<Teacher>();
	private List<Student> studentList = new ArrayList<Student>();
	
	public Classes(String className) {
		super();
		this.className = className;
	}
	
	public void addTeacherToClass(Teacher teacher) {
		teachersList.add(teacher);
	}
	
	public void addStudentToClass(Student student) {
		studentList.add(student);
	}
	
	public void showClassData() {
		// TODO Auto-generated method stub
		System.out.println("Class name: "+className.toUpperCase()+"\n\nTeacher: \n");
		for (int c = 0; c < teachersList.size(); c++) {
			teachersList.get(c).showTeacherData();
		}
		System.out.println("Students: \n");
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).showStudentData();
		}
	}

}
