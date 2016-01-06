package com.ain.syl.service;

import com.ain.syl.domain.admin.User;
import com.ain.syl.repository.admin.UserRepository;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Inject
	private UserRepository userRepo;

	private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

	@Override
	public final User loadUserByUsername(String username) throws UsernameNotFoundException {
		final User user = userRepo.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		detailsChecker.check(user);
		return user;
	}
}
