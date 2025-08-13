package com.devfalco.RespostNow.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfalco.RespostNow.dto.TestsDTO;
import com.devfalco.RespostNow.model.Student;
import com.devfalco.RespostNow.model.Tests;
import com.devfalco.RespostNow.respository.StudentRepository;
import com.devfalco.RespostNow.respository.TestsRespository;

@Service
public class TestService {
    @Autowired
    TestsRespository testsRespository;
    @Autowired
    StudentRepository studentRepository;

    public TestService(TestsRespository testsRespository, StudentRepository studentRepository) {
        this.testsRespository = testsRespository;
        this.studentRepository = studentRepository;
    }

    public Tests createTest(TestsDTO data) {
        Tests newTests = new Tests();
        newTests.setTitle(data.title());
        newTests.setDescription(data.description());
        newTests.setYear(data.year());
        newTests.setGrade(data.grade());
        newTests.setSubject(data.subject());

        Student student = studentRepository.findByEmail(data.email());

        if (student == null) {
            throw new RuntimeException("Usuário inexistente");
        }

        newTests.setStudent(student);

        return testsRespository.save(newTests);
    }

    public Tests deleteTest(TestsDTO data) {
        Optional<Tests> tesOptional = testsRespository.findById(data.id());
        if (tesOptional.isPresent()) {
            Tests test = tesOptional.get();
            return test;
        } else {
            throw new RuntimeException("Teste nao encontrado");
        }
    }

    public Tests alterTest(TestsDTO data) {
        Optional<Tests> tesOptional = testsRespository.findById(data.id());
        if (tesOptional.isEmpty()) {
            throw new RuntimeException("Test nao encotrado");
        }
        Tests tests = tesOptional.get();
        tests.setDescription(data.description());
        tests.setGrade(data.grade());
        tests.setTitle(data.title());
        tests.setGrade(data.grade());
        tests.setSubject(data.subject());

        return testsRespository.save(tests);
    }

    public Tests getTest(TestsDTO data) {
        return testsRespository.findById(data.id())
                .orElseThrow(() -> new RuntimeException("Teste não encontrado"));
    }

}