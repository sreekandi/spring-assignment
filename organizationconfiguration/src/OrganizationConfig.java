package com.capgemini.spring.config;

import com.capgemini.spring.organization.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.*;
import java.util.*; 
import java.io.*;

@Configuration
public class OrganizationConfig {


	public Address getAddress() {
		Address address = new Address(331,"balaji","Tangutur","Ap",254631);
		return address;
	}	

	
	public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
 		directors.add("John");
		directors.add("Jane");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
 		branches.add("admin");
		branches.add("hr");
		return branches;
	}

	public Map<String,String> getBranchWiseHead(){
		Map<String,String> branchWiseHead = new HashMap<>();
 		branchWiseHead.put("admin","John");
		branchWiseHead.put("hr","Jane");
		return branchWiseHead;
	}

	public Properties getIpAddresses(){
		Properties ipAddress = new Properties();
		ipAddress.put("admin", "192.168.1.1");
		ipAddress.put("hr", "192.168.1.2");
		return ipAddress;
	}
	public Properties getDatabaseDetails(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try {

			reader = new FileReader("src/dbConfig.properties");
			databaseDetails.load(reader);
	
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return databaseDetails;
	}

	
	@Bean("organization")
	public Organization organization(){
		Organization organization = new Organization();
		organization.setOrgId(101);
		organization.setOrgName("Capgemini");
		organization.setMarketPrice(20000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddresses());
		organization.setDatabaseDetails(getDatabaseDetails());
		return organization;
	}
}