package com.spring.studentmanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.studentmanagement.Model.Student;
@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

}
