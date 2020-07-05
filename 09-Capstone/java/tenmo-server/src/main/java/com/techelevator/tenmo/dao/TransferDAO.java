package com.techelevator.tenmo.dao;



import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.TransferDTO;

public interface TransferDAO {
	
	

	Transfer initiateTransfer(Transfer transfer);

	boolean updateBalances(Transfer transfer);

	//void preTransfer(Transfer transfer);






	
}
