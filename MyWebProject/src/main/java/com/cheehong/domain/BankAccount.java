package com.cheehong.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Chee-Hong Hsia
 * Abstract Superclass Bankaccount domain model.
 * A "single table" Hibernate strategy has been chosen to enhance performance.
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="BANKACCOUNT_TYPE", discriminatorType=DiscriminatorType.STRING)
@Table(name="BANKACCOUNT")
public abstract class BankAccount {
	
	protected long ID;
	protected String nameOfUser;
	protected double amount;
	protected long accountNumber;
	protected User user;
	
	@Id 
	@GeneratedValue 
	@Column(name="ID") 
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	
	@Column(name="AMOUNT") 
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Column(name="USER_OF_BANKACCOUNT") 
	public String getNameOfUser() {
		return nameOfUser;
	}
	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}
	
	@Column(name="ACCOUNTNUMBER") 
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@OneToOne(cascade={CascadeType.PERSIST})
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
