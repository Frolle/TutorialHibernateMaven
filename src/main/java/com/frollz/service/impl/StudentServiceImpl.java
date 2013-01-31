package com.frollz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frollz.dao.StudentDAO;
import com.frollz.model.Student;
import com.frollz.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public void add(Student student) {
		studentDAO.add(student);
	}

	@Transactional
	public void edit(Student student) {
		studentDAO.edit(student);
	}

	@Transactional
	public void delete(int studentID) {
		studentDAO.delete(studentID);
	}

	@Transactional
	public Student getStudent(int studentID) {
		return studentDAO.getStudent(studentID);
	}

	@Transactional
	public List getAllStudents() {
		return studentDAO.getAllStudents();
	}

}
