package com.ain.syl.support.token;

import com.ain.syl.domain.admin.User;

import com.google.common.base.Preconditions;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import com.ain.syl.service.UserDetailsService;

import com.ain.syl.support.validation.StringConditions;

public final class TokenHandler {

    private final String secret;

    private final UserDetailsService userService;

    public TokenHandler(String secret, UserDetailsService userService) {
        this.secret = StringConditions.checkNotBlank(secret);
        this.userService = Preconditions.checkNotNull(userService);
    }

    public User parseUserFromToken(String token) {
        String username = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
        System.out.println("username => " + username );
        return userService.loadUserByUsername(username);
    }

    public String createTokenForUser(User user) {
        return Jwts.builder().setSubject(user.getUsername()).signWith(SignatureAlgorithm.HS512, secret).compact();
    }
}