package com.online.exam.onlineexam.controllers;

import com.online.exam.onlineexam.exceptions.UserAlreadyExist;
import com.online.exam.onlineexam.exceptions.UserNotFoundException;
import com.online.exam.onlineexam.model.requests.UserDetailsReq;
import com.online.exam.onlineexam.model.responses.UserDetailsRes;
import com.online.exam.onlineexam.service.OnlineExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/online-exam")
@CrossOrigin(origins = "http://localhost:4200")
public class OnlineExamController {

    private final OnlineExamService examService;

    public OnlineExamController(OnlineExamService examService) {
        this.examService = examService;
    }

    @PostMapping("/user")
    public UserDetailsRes registerUser(@RequestBody UserDetailsReq userDetailsReq) throws UserAlreadyExist {
        return examService.registerUserDetails(userDetailsReq);
    }

    @GetMapping("/user-list")
    public List<UserDetailsRes> getUserList() throws UserNotFoundException {
        return examService.getAllUsers();
    }

}
