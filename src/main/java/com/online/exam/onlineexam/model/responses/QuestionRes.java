package com.online.exam.onlineexam.model.responses;

import java.util.List;

public class QuestionRes {
    private Integer questionId;
    private String question;
    private List<OptionRes> optionList;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<OptionRes> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<OptionRes> optionList) {
        this.optionList = optionList;
    }
}
