package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Student student = new Student ();
		student.setId(3);
		student.setName("xyz");
		student.setEmail("xyz@gmail.com");
		student.setGender("male");
		student.setCno(75206);
		
		StudentDao  studentDao = new StudentDao();
		 studentDao.saveStudent(student);
	}
}
