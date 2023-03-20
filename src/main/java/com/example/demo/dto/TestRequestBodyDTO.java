package com.example.demo.dto;

import lombok.Data; //getter, setter 자동으로 생성

@Data
public class TestRequestBodyDTO {
    private  int id;
    private  String message;
}
