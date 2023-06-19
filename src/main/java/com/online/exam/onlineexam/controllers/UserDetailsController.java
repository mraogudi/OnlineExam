package com.online.exam.onlineexam.controllers;

import com.online.exam.onlineexam.model.requests.UserDetailsReq;
import com.online.exam.onlineexam.model.responses.UserDetailsRes;
import com.online.exam.onlineexam.service.OnlineExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/online")
public class UserDetailsController {

    @Autowired
    private OnlineExamService examService;

    @PostMapping("/user")
    public UserDetailsRes registerUser(@RequestBody UserDetailsReq userDetailsReq) {
        return new UserDetailsRes();
    }

    @GetMapping("/user")
    public List<UserDetailsRes> getUserList() {
        return examService.getAllUsers();
    }

}
