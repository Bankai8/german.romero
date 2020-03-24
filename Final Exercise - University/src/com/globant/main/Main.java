package com.globant.main;
import java.util.ArrayList;
import java.util.List;

import com.globant.university.*;

public class Main {
	
private static List<Classes> classesList = new ArrayList<Classes>();

	public static void main(String[] args) {

		//Full time teachers - Parameters (expyears)
		
		FullTimeTeacher tcAndrea = new FullTimeTeacher(5);
		tcAndrea.setName("Andrea");
		tcAndrea.calculateSalary();
		
		FullTimeTeacher tcLorena = new FullTimeTeacher(2);
		tcLorena.setName("Lorena");
		tcLorena.calculateSalary();
		
		//Partial time Teachers - Parameters (expyears)
		
		PartialTimeTeacher tcMiguel = new PartialTimeTeacher(6,200);
		tcMiguel.setName("Miguel");
		tcMiguel.calculateSalary();
		
		PartialTimeTeacher tcAnderson = new PartialTimeTeacher(4,160);
		tcAnderson.setName("Anderson");
		tcAnderson.calculateSalary();
		
		//Students
		
		Student stRoberto = new Student("Roberto",1547898741,15);
		Student stClaudia = new Student("Claudia",54874579,17);
		Student stAlberto = new Student("Alberto",21478547,16);
		Student stMartha = new Student("Martha",2014785474,12);
		Student stNydian = new Student("Nydian",54784145,15);
		Student stJorge = new Student("Jorge",1245781111,14);
		
		//Classes
		
		Classes music = new Classes("music");
		music.addTeacherToClass(tcAndrea);
		music.addStudentToClass(stRoberto);
		music.addStudentToClass(stClaudia);
		music.addStudentToClass(stAlberto);
		music.addStudentToClass(stMartha);
		music.addStudentToClass(stNydian);
		music.addStudentToClass(stJorge);
		
		Classes math = new Classes("math");
		math.addTeacherToClass(tcLorena);
		math.addStudentToClass(stRoberto);
		math.addStudentToClass(stClaudia);
		math.addStudentToClass(stMartha);
		
		Classes science = new Classes("science");
		science.addTeacherToClass(tcMiguel);
		science.addStudentToClass(stMartha);
		science.addStudentToClass(stNydian);
		science.addStudentToClass(stJorge);
		
		Classes biology = new Classes("biology");
		biology.addTeacherToClass(tcAnderson);
		biology.addStudentToClass(stRoberto);
		biology.addStudentToClass(stAlberto);
		biology.addStudentToClass(stMartha);
		biology.addStudentToClass(stNydian);
		biology.addStudentToClass(stClaudia);
		
		classesList.add(music);
		classesList.add(math);
		classesList.add(science);
		classesList.add(biology);
		
		//shows all class data teachers and students
		for (int i = 0; i < classesList.size(); i++) {
			classesList.get(i).showClassData();
		}
	}

}
