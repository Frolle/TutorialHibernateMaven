package com.frollz.dao;

import java.util.List;

import com.frollz.model.Student;

public interface StudentDAO {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentID);
	public Student getStudent(int studentID);
	public List getAllStudents();
}
