package com.example.simplethymeleafproject.service;

import com.example.simplethymeleafproject.dto.StudentCreateDto;
import com.example.simplethymeleafproject.dto.StudentReadDto;

import java.util.List;

public interface StudentService {

    public List<StudentReadDto> findAll();

    public void create(StudentCreateDto student);
}
