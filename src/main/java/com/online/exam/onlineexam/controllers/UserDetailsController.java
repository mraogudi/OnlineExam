package com.online.exam.onlineexam.controllers;

import com.online.exam.onlineexam.model.requests.UserDetailsReq;
import com.online.exam.onlineexam.model.responses.UserDetailsRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/online")
public class UserDetailsController {

    @PostMapping("/user")
    public ResponseEntity<UserDetailsRes> registerUser(@RequestBody @Validated UserDetailsReq userDetailsReq) {
        return new ResponseEntity<>(new UserDetailsRes(), HttpStatus.OK);
    }

}
