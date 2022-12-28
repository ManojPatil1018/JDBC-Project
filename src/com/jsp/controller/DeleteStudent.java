package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(3);
		 
		StudentDao studentdao = new StudentDao();
		 studentdao.deleteStudent(student);
	}
}
