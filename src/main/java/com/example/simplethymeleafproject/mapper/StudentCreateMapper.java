package com.example.simplethymeleafproject.mapper;

import com.example.simplethymeleafproject.dto.StudentCreateDto;
import com.example.simplethymeleafproject.entity.Student;
import com.example.simplethymeleafproject.util.MarkConverter;
import org.springframework.stereotype.Component;

@Component
public class StudentCreateMapper implements Mapper<StudentCreateDto, Student>{

    @Override
    public Student map(StudentCreateDto object) {
        return Student.builder()
                .name(object.getName())
                .surname(object.getSurname())
                .exam(object.getExam())
                .mark(MarkConverter.createMark(object.getExam()))
                .build();
    }
}
