package com.online.exam.onlineexam.service;

import com.online.exam.onlineexam.model.entities.UserDetails;
import com.online.exam.onlineexam.model.responses.UserDetailsRes;
import com.online.exam.onlineexam.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OnlineExamService {
    @Autowired
    private UserDetailsRepository detailsRepository;

    public List<UserDetailsRes> getAllUsers() {
        List<UserDetails> userDetailsList = StreamSupport
                .stream(detailsRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return userDetailsList.stream().map(this::mapObjectToDetails).collect(Collectors.toList());
    }

    private UserDetailsRes mapObjectToDetails(UserDetails user) {
        UserDetailsRes detailsRes = new UserDetailsRes();
        detailsRes.setEmail(user.getEmail());
        detailsRes.setName(user.getName());
        detailsRes.setMobileNo(user.getPhoneNo());
        return detailsRes;
    }
}
