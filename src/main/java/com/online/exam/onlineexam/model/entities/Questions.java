package com.online.exam.onlineexam.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "tbl_questions", schema = "gmrao")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "question")
    private String question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
