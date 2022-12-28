package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.Student;
import com.jsp.util.Helperclass;

public class StudentDao {
                         
	 Helperclass helperclass =new Helperclass();
	 
	 //method to save student
	 public void saveStudent(Student student) {
		 String sql = "INSERT INTO student VALUES(?,?,?,?,?)";
		 Connection connection = helperclass.getConnection();
		 
		 try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setString(4, student.getGender());
           preparedStatement.setLong(5, student.getCno());
           
           preparedStatement.execute();
           System.out.println("All good");
           
           if(connection != null) {
           	connection.close();
           }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	//method to Delete student
	 public void deleteStudent(Student student){
			String sql ="DELETE FROM student WHERE ID=?";
			Connection connection = helperclass.getConnection();
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1,student.getId() );
				
				preparedStatement.executeUpdate();
				System.out.println("data deleted");
				
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	//method to Update student
	 public void updateStudent(Student student){
			String sql ="UPDATE student SET NAME=? WHERE ID=?";
			Connection connection = helperclass.getConnection();
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1,student.getName());
				preparedStatement.setInt(2,student.getId() );
				
				preparedStatement.executeUpdate();
				System.out.println("data upadated");
				
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	 //Batch Execution
	 public void addmultipleStudent(List<Student> students) {
		 Connection connection = helperclass.getConnection();
		 String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		 PreparedStatement preparedStatement = null;
		 //For each loop
		 for (Student student : students) {
			
			 try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, student.getId());
				preparedStatement.setString(2, student.getName());
				preparedStatement.setString(3, student.getEmail());
				preparedStatement.setString(4, student.getGender());
	            preparedStatement.setLong(5, student.getCno());
	            
				preparedStatement.addBatch();
				preparedStatement.executeBatch();
				System.out.println("All good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 
}