package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringDataJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaAppApplication.class, args);
		StudentService service = ctx.getBean(StudentService.class);

		saveStudent(service);

		// System.out.println(service.findStudentById(61));

		// service.deleteStudent(new Student(61, null, null));

		// System.out.println(service.getAllStudentNames());

		// System.out.println(service.getAllStudents());

	}

	private static void saveStudent(StudentService service) {
		// Set the data to Entity class
		Student s = new Student();
		s.setSname("Ramu");
		s.setSemail("ramu@gmail.com");

		// call service layer method
		service.saveStudent(s);
	}

}
