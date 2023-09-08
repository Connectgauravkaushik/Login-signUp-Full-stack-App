package com.project.structure.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.structure.model.User;
import com.project.structure.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}