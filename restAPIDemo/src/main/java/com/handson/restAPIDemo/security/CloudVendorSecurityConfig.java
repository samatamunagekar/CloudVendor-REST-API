package com.handson.restAPIDemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class CloudVendorSecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				(req)->
				req.requestMatchers("/api","/api/v1").permitAll()
				.anyRequest().authenticated()
				).formLogin();
		return http.build();
		
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		User.UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails userOne = users
				.username("testUserOne")
				.password("UserOnePwd")
				.roles("USER")
				.build();
		
		UserDetails userTwo = users
				.username("testUserTwo")
				.password("UserTwoPwd")
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(userOne,userTwo);
		
	}

}
