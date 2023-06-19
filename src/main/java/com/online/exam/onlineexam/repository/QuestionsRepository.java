package com.online.exam.onlineexam.repository;

import com.online.exam.onlineexam.model.entities.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends CrudRepository<Questions, Integer> {
}
