package com.module1.tutospringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.module1.tutospringBoot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}

