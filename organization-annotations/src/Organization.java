package com.capgemini.spring.organization;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import javax.annotation.Resource;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
public class Organization {
	
	@Value("125")
	private int orgId;
	
	@Value("vrk")
	private String orgName;
	
	@Value("1200.0")
	private double marketPrice;
	
	@Autowired
	private Address address;
	
	@Resource(name="directors")
	private List<String> directors;

	@Resource(name="branches")
	private Set<String> branches;

	@Resource(name="brancchwisedirectors")
	private Map<String, String> branchWiseHead;

	@Resource(name="ip")
	private Properties ipAddresses;

	@Resource(name="database")
	private Properties databaseDetails;

	public Organization() {
		super();
	}
	
	
	public Organization(int orgId, String orgName, double marketPrice, Address address, List<String> directors,
			Set<String> branches, Map<String, String> branchWiseHead, Properties ipAddresses,
			Properties databaseDetails) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.marketPrice = marketPrice;
		this.address = address;
		this.directors = directors;
		this.branches = branches;
		this.branchWiseHead = branchWiseHead;
		this.ipAddresses = ipAddresses;
		this.databaseDetails = databaseDetails;
	}
	
	public int getOrgId() {
		return orgId;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
	public String getOrgName() {
		return orgName;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public double getMarketPrice() {
		return marketPrice;
	}
	
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<String> getDirectors() {
		return directors;
	}
	
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	
	public Set<String> getBranches() {
		return branches;
	}
	
	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}
	
	public Map<String, String> getBranchWiseHead() {
		return branchWiseHead;
	}
	
	public void setBranchWiseHead(Map<String, String> branchWiseHead) {
		this.branchWiseHead = branchWiseHead;
	}
	
	public Properties getIpAddresses() {
		return ipAddresses;
	}
	
	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	
	public Properties getDatabaseDetails() {
		return databaseDetails;
	}
	
	public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
	}
	
	//For 3parameters
	/*@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + "]";
	}*/
	
	//For Addrees Parameter
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ", address="
				+ address + ",\n directors=" + directors + ",\n branches=" + branches + ",\n branchWiseHead=" + branchWiseHead + ",\n ipAddresses=" + ipAddresses + ",\n databaseDetails=" + databaseDetails + "]";
	}
	
	

}
