package com.globant.main;
import java.util.ArrayList;
import java.util.List;

import com.globant.university.*;

public class Main {
	
private static List<Teacher> teachersList = new ArrayList<Teacher>();
private static List<Student> studentList = new ArrayList<Student>();
private static List<Classes> classesList = new ArrayList<Classes>();

	public static void main(String[] args) {

		//Full time teachers
		
		Teacher tcAndrea = new Teacher(true, 3);
		tcAndrea.setName("Andrea");
		
		Teacher tcLorena = new Teacher(true, 2);
		tcLorena.setName("Lorena");
		
		//Partial time Teachers
		
		Teacher tcMiguel = new Teacher(false, 5);
		tcMiguel.setName("Miguel");
		
		Teacher tcAnderson = new Teacher(false, 5);
		tcAnderson.setName("Anderson");
		
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
