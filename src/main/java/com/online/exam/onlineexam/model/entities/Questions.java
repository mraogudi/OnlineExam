package com.online.exam.onlineexam.model.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbl_questions", schema = "gmrao")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "question")
    private String question;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Options> optionsList;

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

    public Set<Options> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(Set<Options> optionsList) {
        this.optionsList = optionsList;
    }
}
