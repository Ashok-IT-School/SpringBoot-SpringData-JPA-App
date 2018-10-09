package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

/**
 * This is used to perform CRUD operations with STUDENT_MASTER TABLE
 * 
 * @author Ashok
 *
 */

@Repository("studentRepository")
public interface StudentRepository extends CrudRepository<Student, Serializable> {
	
	/**
	 * This method is used to execute given query (Custom query)
	 * @return
	 */
	@Query("select sname from Student")
	public List<String> findStudentNames();

}
