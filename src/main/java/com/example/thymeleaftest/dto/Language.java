package com.example.thymeleaftest.dto;

import lombok.Getter;

@Getter
//Enum : 상수들의 집합 (상수 : 변하지 않는 고정값)
public enum Language {
    //키값
    JAVA("자바"),
    C("C언어"),
    CPP("C++"),
    PYTHON("파이썬");

    private final String description;
    Language(String description) {
        this.description = description;
    }
}
