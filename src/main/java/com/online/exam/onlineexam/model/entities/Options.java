package com.online.exam.onlineexam.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_options", schema = "gmrao")
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "option")
    private String options;
    @Column(name = "correct")
    private String answer;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Integer questionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
