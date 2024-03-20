package com.spring.studentmanagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.studentmanagement.DAO.StudentDao;
import com.spring.studentmanagement.Model.Student;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;
    public List<Student> getAllStudents() {
        return studentDao.findAll();   
    }
    public Student getStudentById(Integer id) {
        @SuppressWarnings("null")
        Optional<Student> optionalStudent = studentDao.findById(id);
        return optionalStudent.orElse(null);
    }
    @SuppressWarnings("null")
    public Student addStudent(Student student) {
        return studentDao.save(student);
    }
    @SuppressWarnings("null")
    public Student updateStudent(Integer id, Student updatedStudent) {
        // Check if the student with the given ID exists
        if (studentDao.existsById(id)) {
            updatedStudent.setID(id);
            return studentDao.save(updatedStudent);
        }
        return null; // Or throw an exception
    }
    @SuppressWarnings("null")
    public void deleteStudent(Integer id) {
         studentDao.deleteById(id);
    }
}
