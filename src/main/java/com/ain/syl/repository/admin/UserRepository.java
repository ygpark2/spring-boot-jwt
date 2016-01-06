package com.ain.syl.repository.admin;

import com.ain.syl.domain.admin.User;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>, QueryDslPredicateExecutor<User> {

	User findByUsername(String username);

}
