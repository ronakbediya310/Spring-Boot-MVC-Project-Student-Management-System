package com.spring.studentmanagement.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.spring.studentmanagement.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.spring.studentmanagement.Model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService StudentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();

    }
     // Get student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return StudentService.getStudentById(id);
    }

     // Create a new student
    @PostMapping("/add")
    public Student addStudent( @RequestBody Student student) {
        return StudentService.addStudent(student);
    }

    // Update an existing student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        return StudentService.updateStudent(id, student);
    }

    // Delete a student by ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        StudentService.deleteStudent(id);
    }
}
