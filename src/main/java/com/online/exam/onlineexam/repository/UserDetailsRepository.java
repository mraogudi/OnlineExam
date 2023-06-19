package com.online.exam.onlineexam.repository;

import com.online.exam.onlineexam.model.entities.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {

    Optional<UserDetails> findByPhoneNo(String phoneNo);
}
