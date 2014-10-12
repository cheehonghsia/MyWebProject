package com.cheehong.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Subclass of BankAccount. 
 * @author Chee-Hong Hsia
 */

@Entity
@DiscriminatorValue("SAVINGSACCOUNT")
public class SavingsAccoung extends BankAccount {
	
	private long ID;
	private double interest;

	@Id 
	@GeneratedValue 
	@Column(name="ID") 
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}
	
	@Column(name="INTEREST") 
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
}
