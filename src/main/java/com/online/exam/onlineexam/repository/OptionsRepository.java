package com.online.exam.onlineexam.repository;

import com.online.exam.onlineexam.model.entities.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends CrudRepository<Options, Integer> {
}
