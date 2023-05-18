package com.example.simplethymeleafproject.service;

import com.example.simplethymeleafproject.dto.StudentCreateDto;
import com.example.simplethymeleafproject.dto.StudentReadDto;
import com.example.simplethymeleafproject.mapper.StudentCreateMapper;
import com.example.simplethymeleafproject.mapper.StudentReadMapper;
import com.example.simplethymeleafproject.respository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentReadMapper studentReadMapper;
    private final StudentCreateMapper studentCreateMapper;

    public List<StudentReadDto> findAll() {
        return studentRepository.findAll().stream()
                .map(studentReadMapper::map)
                .toList();
    }

    public void create(StudentCreateDto student) {
        Optional.of(student)
                .map(studentCreateMapper::map)
                .map(studentRepository::save)
                .orElseThrow();
    }
}
