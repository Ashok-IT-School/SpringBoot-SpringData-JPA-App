package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;

@Service("studentService")
public class StudentService {

	public StudentService() {
		System.out.println("***StudentService:::Constructor***");
	}

	@Autowired(required = true)
	private StudentRepository studentRepository;

	public void saveStudent(Student s) {
		System.out.println("B4 Save::" + s);

		// saving Student Entity
		Student student = studentRepository.save(s);

		System.out.println("After Save::" + student);
	}

	/**
	 * This method is used to retrieve one Student record using Primary key
	 * 
	 * @param sid
	 * @return
	 */
	public Student findStudentById(Integer sid) {
		return studentRepository.findOne(sid);
	}

	/**
	 * This method is used to get all records from table
	 * 
	 * @return
	 */
	public Iterable<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	/**
	 * This method is used to all Student names from table
	 * 
	 * @return
	 */
	public List<String> getAllStudentNames() {
		return studentRepository.findStudentNames();
	}

	/**
	 * This method is used to delete a Student record
	 * 
	 * @param s
	 */
	public void deleteStudent(Student s) {
		studentRepository.delete(s);
	}

}
