package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		Student student = new Student ();
		student.setId(3);
		student.setName("abc");
		student.setEmail("abc@gmail.com");
		student.setGender("male");
		student.setCno(8752167415l);
		
		StudentDao  studentDao = new StudentDao();
		 studentDao.updateStudent(student);
	}
}
