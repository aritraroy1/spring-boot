package com.aritra.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aritra.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
