package com.globant.main;
import java.util.ArrayList;
import java.util.List;

import com.globant.university.*;

public class Main {
	
private static List<FullTimeTeacher> teachersList = new ArrayList<FullTimeTeacher>();
private static List<Student> studentList = new ArrayList<Student>();
private static List<Classes> classesList = new ArrayList<Classes>();

	public static void main(String[] args) {

		//Full time teachers - Parameters (expyears)
		
		FullTimeTeacher tcAndrea = new FullTimeTeacher(5);
		tcAndrea.setName("Andrea");
		tcAndrea.calculateSalary();
		tcAndrea.showTeacherData();
		
		FullTimeTeacher tcLorena = new FullTimeTeacher(2);
		tcLorena.setName("Lorena");
		tcLorena.calculateSalary();
		tcLorena.showTeacherData();
		
		//Partial time Teachers - Parameters (expyears)
		
		PartialTimeTeacher tcMiguel = new PartialTimeTeacher(6,200);
		tcMiguel.setName("Miguel");
		tcMiguel.calculateSalary();
		tcMiguel.showTeacherData();
		
		PartialTimeTeacher tcAnderson = new PartialTimeTeacher(4,160);
		tcAnderson.setName("Anderson");
		tcAnderson.calculateSalary();
		tcAnderson.showTeacherData();
		
		//Students
		
		Student stRoberto = new Student("Roberto",1547898741,15);
		Student stClaudia = new Student("Claudia",54874579,17);
		Student stAlberto = new Student("Alberto",21478547,16);
		Student stMartha = new Student("Martha",2014785474,12);
		Student stNydian = new Student("Nydian",54784145,15);
		Student stJorge = new Student("Jorge",1245781111,14);
		
		//Classes
		
		Classes math = new Classes("math");
		Classes science = new Classes("science");
		Classes music = new Classes("music");
		Classes biology = new Classes("biology");
	}

}
