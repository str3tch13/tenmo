package com.techelevator.tenmo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.tenmo.model.Account;

@Component
public class AccountSqlDAO implements AccountDAO{

	 private JdbcTemplate jdbcTemplate;
	 public AccountSqlDAO(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

	 @Override
	 public BigDecimal viewCurrentBalance(String username) {
		
	    	return jdbcTemplate.queryForObject("SELECT balance FROM accounts "
	    			+ "JOIN users ON users.user_id = accounts.user_id "
	    			+ "WHERE users.user_id = ?;", BigDecimal.class, username);    	
	    
	    }

	@Override
	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<>();
		SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT * FROM accounts");
		while(results.next()) {
			Account account = mapRowToAccount(results);
			accounts.add(account);
		}
		return accounts;
	}

	private Account mapRowToAccount(SqlRowSet results) {
		Account account = new Account();
        account.setaccountId(results.getInt("account_id"));
        account.setuserId(results.getInt("user_id"));
        account.setbalance(results.getBigDecimal("balance"));
        return account;
		
	}

}
