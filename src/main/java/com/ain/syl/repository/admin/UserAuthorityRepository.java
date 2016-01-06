package com.ain.syl.repository.admin;

import com.ain.syl.domain.admin.UserAuthority;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthorityRepository extends CrudRepository<UserAuthority, Long>, QueryDslPredicateExecutor<UserAuthority> {

	UserAuthority findByAuthority(String authority);

}
