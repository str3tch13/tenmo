package com.techelevator.tenmo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.tenmo.dao.AccountDAO;
import com.techelevator.tenmo.model.Account;

@RestController
public class AccountController {
	private AccountDAO accountDAO;
	
	
	public AccountController(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	@RequestMapping(path = "accounts",method = RequestMethod.GET)
	public List<Account> findAll() {
		return accountDAO.findAll();
}

		
	
}