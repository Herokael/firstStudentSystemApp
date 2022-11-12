package com.ezealva.studentsystem.service.implementation;

import com.ezealva.studentsystem.model.Student;
import com.ezealva.studentsystem.repository.StudentRepository;
import com.ezealva.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
