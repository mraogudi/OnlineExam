package com.online.exam.onlineexam.service;

import com.online.exam.onlineexam.exceptions.UserAlreadyExist;
import com.online.exam.onlineexam.exceptions.UserNotFoundException;
import com.online.exam.onlineexam.model.entities.UserDetails;
import com.online.exam.onlineexam.model.requests.UserDetailsReq;
import com.online.exam.onlineexam.model.responses.UserDetailsRes;
import com.online.exam.onlineexam.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OnlineExamService {
    private final UserDetailsRepository detailsRepository;

    public OnlineExamService(UserDetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    public List<UserDetailsRes> getAllUsers() throws UserNotFoundException {
        List<UserDetails> userDetailsList = StreamSupport
                .stream(detailsRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        if (userDetailsList.isEmpty()) {
            throw new UserNotFoundException("No users registered till date");
        }
        return userDetailsList.stream().map(this::mapObjectToDetails).collect(Collectors.toList());
    }

    private UserDetailsRes mapObjectToDetails(UserDetails user) {
        UserDetailsRes detailsRes = new UserDetailsRes();
        detailsRes.setEmail(user.getEmail());
        detailsRes.setName(user.getName());
        detailsRes.setMobileNo(user.getPhoneNo());
        return detailsRes;
    }

    public UserDetailsRes registerUserDetails(UserDetailsReq userDetailsReq) throws UserAlreadyExist {
        Optional<UserDetails> details = detailsRepository.findByPhoneNo(userDetailsReq.getMobileNo());
        if(details.isEmpty()) {
            UserDetails userDetails = new UserDetails();
            userDetails.setEmail(userDetailsReq.getEmail());
            userDetails.setName(userDetailsReq.getName());
            userDetails.setPhoneNo(userDetailsReq.getMobileNo());
            userDetails.setRegisteredDate(LocalDateTime.now());
            detailsRepository.save(userDetails);
        } else {
            LocalDateTime current = LocalDateTime.now();
            LocalDateTime registeredDate = details.get().getRegisteredDate();
            long days = ChronoUnit.DAYS.between(registeredDate, current);
            if (days > 30) {
                details.get().setRegisteredDate(LocalDateTime.now());
                detailsRepository.save(details.get());
            } else {
                throw new UserAlreadyExist("User Already exist");
            }
        }
        return null;
    }
}
