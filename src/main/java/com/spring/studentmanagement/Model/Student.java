package com.spring.studentmanagement.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID ;
    private String Name;
    private String Division;
    private String Email;
    private String City;
    private String Domain;

    
}
