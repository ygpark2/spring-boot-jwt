package com.ain.syl.web.controller.api;

import com.ain.syl.domain.admin.UserAuthentication;
import com.ain.syl.domain.admin.User;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {

    @RequestMapping(value = "/pub/hello", method = RequestMethod.GET)
    public Greeting hello() {
        return new Greeting("Hello world");
    }

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    public Greeting securedHello() throws AuthenticationException {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof UserAuthentication)) {
            throw new AuthenticationServiceException("Bad authentication object");
        }
        System.out.println("api hello called !~!!!!!!!!!!!!");
        User user = ((UserAuthentication) authentication).getDetails();
        return new Greeting("Hello " + user.getUsername());
    }

    @RequestMapping(value = "/annot/hello", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ANNOT')")
    public Greeting securedAnnotationHello() throws AuthenticationException {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof UserAuthentication)) {
            throw new AuthenticationServiceException("Bad authentication object");
        }
        User user = ((UserAuthentication) authentication).getDetails();
        return new Greeting("Hello " + user.getUsername());
    }

}
