package com.techelevator.tenmo.dao;


import java.util.List;

import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.User;

public interface TransferDAO {
	
	

	Transfer initiateTransfer(Transfer transfer);

	boolean updateBalances(Transfer transfer);




	
}
