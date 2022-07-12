package com.curd.service;

import java.util.ArrayList;
import java.util.List;

import com.curd.model.Student;

public interface StudentCrud {

	int insertRecord(Student student);
	int updateRecord(Student student);
	int deleteRecord(int rollno);
	Student getStudentByRollno(int rollno);
	List<Student> getAllRecords();
	
	
}
