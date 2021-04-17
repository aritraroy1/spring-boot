/**
 * 
 */
package com.aritra.studentrestapi.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aritra.studentrestapi.entity.Student;

/**
 * @author Aritra
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
