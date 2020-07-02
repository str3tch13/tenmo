package com.techelevator.tenmo.controller;

import java.security.Principal;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.tenmo.dao.UserDAO;
import com.techelevator.tenmo.model.User;

@RequestMapping("/account")
@PreAuthorize("isAuthenticated()")
@RestController
public class UserController {
	
private UserDAO userDAO;

public UserController(UserDAO userDAO) {
	this.userDAO = userDAO;
}
	
	@RequestMapping(value = "/allaccounts", method = RequestMethod.GET)
	public List<User> getAccount(Principal principal) throws AccountNotFoundException {
		return userDAO.findAll();
	}
}
