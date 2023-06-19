package com.online.exam.onlineexam.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user_answers", schema = "gmrao")
public class UserAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_id")
    private Integer user_details_id;
    @Column(name = "question_id")
    private Integer question_id;
    @Column(name = "option_id")
    private Integer options_id;

    public Integer getUser_details_id() {
        return user_details_id;
    }

    public void setUser_details_id(Integer user_details_id) {
        this.user_details_id = user_details_id;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public Integer getOptions_id() {
        return options_id;
    }

    public void setOptions_id(Integer options_id) {
        this.options_id = options_id;
    }

    public Integer getUser_options_id() {
        return user_options_id;
    }

    public void setUser_options_id(Integer user_options_id) {
        this.user_options_id = user_options_id;
    }

    @Column(name = "user_option_id")
    private Integer user_options_id;
    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
