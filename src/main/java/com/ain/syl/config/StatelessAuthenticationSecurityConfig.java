package com.ain.syl.config;

import com.ain.syl.support.token.StatelessAuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ain.syl.service.TokenAuthenticationService;
import com.ain.syl.service.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.inject.Inject;

@EnableWebSecurity
@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
// @EnableGlobalMethodSecurity(prePostEnabled = true)
public class StatelessAuthenticationSecurityConfig extends WebSecurityConfigurerAdapter {

	@Inject
	private UserDetailsService userDetailsService;

	@Inject
	private TokenAuthenticationService tokenAuthenticationService;

	@Value("${server.servlet-path}")
	private String servletPath;

	public StatelessAuthenticationSecurityConfig() {
		// Disable defaults
		super(true);
	}

	@Override
	public void configure(WebSecurity web){
		web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/fonts/**", "/*.html");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
			.exceptionHandling().and()
			.anonymous().and()
			.servletApi().and()
			.headers().cacheControl().and().and()
			.authorizeRequests()

			.antMatchers(servletPath).permitAll()

			// allow anonymous POSTs to login
			.antMatchers(HttpMethod.POST, servletPath + "/api/login").permitAll()

			// allow anonymous GETs to API
			// .antMatchers(HttpMethod.GET, "/api/**").permitAll()

			// defined Admin only API area
			.antMatchers(servletPath + "/admin/**").hasRole("ADMIN")

			// all other request need to be authenticated
			.anyRequest().hasRole("USER").and()

			// custom JSON based authentication by POST of {"username":"<name>","password":"<password>"} which sets the token header upon authentication
			.addFilterBefore(new StatelessLoginFilter(servletPath + "/api/login", tokenAuthenticationService, userDetailsService, authenticationManager()), UsernamePasswordAuthenticationFilter.class)

			// Custom Token based authentication based on the header previously given to the client
			.addFilterBefore(new StatelessAuthenticationFilter(tokenAuthenticationService), UsernamePasswordAuthenticationFilter.class);
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Password encrypter for User service and user repository
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	// @Override
	// protected UserDetailsService userDetailsService() {
	// 	return userDetailsService;
	// }
}
