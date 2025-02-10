package com.example.thymeleaftest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserInfo {
    private String nickname;
    private String email;
    private boolean trueOrFalse;
    private List<String> hobbies; //멀티체크박스 취미데이터 얻어오기
    private String language; // radio-button(옵션 단추) -- 오로지 결과 1개
    private String country; // select list
}
