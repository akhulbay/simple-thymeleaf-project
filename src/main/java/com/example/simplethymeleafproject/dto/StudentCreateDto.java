package com.example.simplethymeleafproject.dto;

import lombok.Value;

@Value
public class StudentCreateDto {
    String name;
    String surname;
    Integer exam;
}
