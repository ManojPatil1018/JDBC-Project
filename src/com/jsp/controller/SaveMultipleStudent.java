package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class SaveMultipleStudent {
	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<Student>();
		Student student1 = new Student ();
		student1.setId(4);
		student1.setName("xyz");
		student1.setEmail("xyz@gmail.com");
		student1.setGender("male");
		student1.setCno(75206);
		
		Student student2 = new Student ();
		student2.setId(5);
		student2.setName("xyz");
		student2.setEmail("xyz@gmail.com");
		student2.setGender("male");
		student2.setCno(75206);
		
		Student student3 = new Student ();
		student3.setId(6);
		student3.setName("xyz");
		student3.setEmail("xyz@gmail.com");
		student3.setGender("male");
		student3.setCno(75206);
		
		s.add(student1);
		s.add(student2);
		s.add(student3);
		
		StudentDao  studentDao = new StudentDao();
		 studentDao.addmultipleStudent(s);
	}
}
