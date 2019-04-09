package com.capgemini.bankapp.config;

import java.sql.Connection;
import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.*;
import com.capgemini.bankapp.util.DbUtil;
import org.springframework.context.annotation.*;

@Configuration
public class BankAppConfig{
	
	/*@Bean
	public BankAccountDao bankAccountDao(){
		BankAccountDaoImpl bankAccountDaoImpl= new BankAccountDaoImpl(connection());
		return bankAccountDaoImpl;
	}

	@Bean
	public BankAccountServiceImpl bankServiceImpl(){
		BankAccountServiceImpl bankAccountDao = new BankAccountServiceImpl(bankAccountDao());
		return bankAccountDao;
	}
	
	@Bean
	public Connection connection(){
		Connection connection = DbUtil.getConnection();
		return connection;
	}*/


	@Bean
	public BankAccountDao bankAccountDao(){
		BankAccountDaoImpl bankAccountDaoImpl = new BankAccountDaoImpl(connection());
		return bankAccountDaoImpl;
	}

	@Bean 
	public BankAccountServiceImpl bankAccountServiceImpl(){
		BankAccountServiceImpl bankAccountServiceImpl = new BankAccountServiceImpl(bankAccountDao());
		return bankAccountServiceImpl;
	}

	@Bean
	public Connection connection(){
		Connection connection=DbUtil.getConnection();
		return connection;
	}	

}