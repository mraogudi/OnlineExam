package com.online.exam.onlineexam.model.responses;

import com.online.exam.onlineexam.model.entities.Options;

import java.util.Set;

public class UserDetailsRes {
    private String name;
    private String mobileNo;
    private String email;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Set<Options> getOptionsSet() {
        return optionsSet;
    }

    public void setOptionsSet(Set<Options> optionsSet) {
        this.optionsSet = optionsSet;
    }

    private Set<Options> optionsSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
