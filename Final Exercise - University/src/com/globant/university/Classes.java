package com.globant.university;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	
	String className;
	private List<FullTimeTeacher> teachersList = new ArrayList<FullTimeTeacher>();
	private List<Student> studentList = new ArrayList<Student>();
	
	public Classes(String className) {
		super();
		this.className = className;
	}
	
	public void addTeacherToClass(FullTimeTeacher teacher) {
		teachersList.add(teacher);
	}
	
	public void addStudentToClass(Student student) {
		studentList.add(student);
	}

}
