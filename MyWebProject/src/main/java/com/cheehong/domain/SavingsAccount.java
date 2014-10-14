package com.cheehong.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Subclass of BankAccount. 
 * @author Chee-Hong Hsia
 */

@Entity
@DiscriminatorValue("SAVINGSACCOUNT")
public class SavingsAccount extends BankAccount {
	
	private double interest;		
	
	@Column(name="INTEREST") 
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
}
