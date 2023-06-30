package com.online.exam.onlineexam.model.responses;

import com.online.exam.onlineexam.model.entities.Options;

import java.util.Set;

public class UserDetailsRes {
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String email;
    private Integer userId;
    private Set<Options> optionsSet;

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

    public Set<Options> getOptionsSet() {
        return optionsSet;
    }

    public void setOptionsSet(Set<Options> optionsSet) {
        this.optionsSet = optionsSet;
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
