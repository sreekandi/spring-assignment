package com.capgemini.bankapp.dao;
import java.util.List;

import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountDao {

	public double getBalance(long accountId);
	public void updateBalance(long accountId,double newBalance);
	public boolean deleteAccount(long accountId);
	public boolean addNewBankAccount(BankAccount account);
	public List<BankAccount> findAllbankAccounts();
	public BankAccount searchCustomerRecord(long accountId);
	public boolean updateBankAccountDetails(long accountId,String accountHolderName,String accountType);
	
}
