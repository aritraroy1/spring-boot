/**
 * 
 */
package com.aritra.studentrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aritra.studentrestapi.entity.Student;
import com.aritra.studentrestapi.respository.StudentRepository;

/**
 * @author Aritra
 *
 */
@RestController
public class StudentController {

	@Autowired
	StudentRepository repository;

	@RequestMapping(value = "/students/", method = RequestMethod.GET)
	public List<Student> getStudents() {

		return repository.findAll();

	}

	@RequestMapping(value = "/students/", method = RequestMethod.POST)
	public Student createStudent(@RequestBody Student student) {

		return repository.save(student);

	}

	@RequestMapping(value = "/students/", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) {

		return repository.save(student);

	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") Integer studentId) {

		return repository.findById(studentId).get();

	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") Integer studentId) {

		repository.deleteById(studentId);

	}

}
