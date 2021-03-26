package com.aritra.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aritra.springdatajpa.entities.Student;
import com.aritra.springdatajpa.repositories.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	public StudentRepository studentRepository;

	@Test
	void testStudentSave() {

		Student student = new Student();
		student.setId(1L);
		student.setName("Aritra");
		student.setTestScore(40);

		//CREATE
		studentRepository.save(student);

		//READ
		Student savedStudent = studentRepository.findById(1L).get();
		assertNotNull(savedStudent);
		assertEquals(student.getTestScore(), savedStudent.getTestScore());
		
		
		//UPDATE
		student.setTestScore(50);
		studentRepository.save(student);
		
		Student updatedStudent = studentRepository.findById(1L).get();
		assertNotNull(updatedStudent);
		assertEquals(50, updatedStudent.getTestScore());
		
		//DELETE
		studentRepository.delete(student);
		
		assertTrue(studentRepository.findById(1L).isEmpty());

	}

}
