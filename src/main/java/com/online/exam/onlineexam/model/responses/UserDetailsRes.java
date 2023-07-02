package com.online.exam.onlineexam.model.responses;

import java.util.List;

public class UserDetailsRes {
    private String firstName;
    private String lastName;
    private Integer userId;
    private List<QuestionRes> questionsList;

    public List<QuestionRes> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<QuestionRes> questionsList) {
        this.questionsList = questionsList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
