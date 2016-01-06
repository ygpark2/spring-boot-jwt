package com.ain.syl.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ain.syl.support.token.TokenHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.ain.syl.domain.admin.User;
import com.ain.syl.domain.admin.UserAuthentication;

@Service
public class TokenAuthenticationService {

	private static final long TEN_DAYS = 1000 * 60 * 60 * 24 * 10;

	@Value("${ecsi.console.token.secret}")
	private String secret;

	@Inject
	private UserDetailsService userService;

	private TokenHandler tokenHandler;

	private String authorizationHeaderPrefix = "Bearer ";

	@PostConstruct
	public void initTokenAuthenticationService() throws Exception {
		this.tokenHandler = new TokenHandler(secret, userService);
		System.out.println("Init method after properties are set : ");
	}

	public void addAuthentication(HttpServletResponse response, UserAuthentication authentication) {
		final User user = authentication.getDetails();
		user.setExpires(System.currentTimeMillis() + TEN_DAYS);
		response.addHeader(HttpHeaders.AUTHORIZATION, authorizationHeaderPrefix.concat(this.tokenHandler.createTokenForUser(user)));
	}

	public Authentication getAuthentication(HttpServletRequest request) {
        // Get the HTTP Authorization header from the request
        String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

		System.out.println("get authentication started !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        // Check if the HTTP Authorization header is present and formatted correctly
        if (authorizationHeader == null || !authorizationHeader.startsWith(authorizationHeaderPrefix)) {
            return null;
            //throw new NotAuthorizedException("Authorization header must be provided");
        }

		System.out.println("get token started !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        // Extract the token from the HTTP Authorization header
        final String token = authorizationHeader.substring(authorizationHeaderPrefix.length()).trim();
		System.out.println("get user started !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        final User user = this.tokenHandler.parseUserFromToken(token);
        if (user != null) {
            return new UserAuthentication(user);
        }
		System.out.println("not found null ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return null;
	}
}
