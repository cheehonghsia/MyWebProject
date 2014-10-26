package com.cheehong.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author Chee-Hong Hsia
 *	Class that represents a User entity.
 *
 */

@Entity
public class User {
	
	private long id;
	private String BSN;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private List<BankAccount> bankaccounts;
	
	public User(){};
	
	public User(String BSN, String firstname, String lastname, String address, String city) {
		this.BSN = BSN;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
	}
	
	@Id 
	@GeneratedValue 
	@Column(name="ID") 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="FIRSTNAME") 
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="LASTNAME") 
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(name="ADDRESS") 
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="CITY") 
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	public List<BankAccount> getBankaccounts() {
		return bankaccounts;
	}
	public void setBankaccounts(List<BankAccount> bankaccounts) {
		this.bankaccounts = bankaccounts;
	}
	
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	@Column(name="BSN") 
	public String getBSN() {
		return BSN;
	}
	public void setBSN(String BSN) {
		this.BSN = BSN;
	}
}
