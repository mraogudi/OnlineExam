package com.online.exam.onlineexam.repository;

import com.online.exam.onlineexam.model.entities.UserAnswers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswersRepository extends CrudRepository<UserAnswers, Integer> {
}
