package com.cheehong.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Subclass of BankAccount. 
 * @author Chee-Hong Hsia
 */
@Entity
@DiscriminatorValue("PAYACCOUNT")
public class PayAccount extends BankAccount {
	
	private Date dateOfTransfer;

	@Column(name="DATE_OF_TRANSFER") 
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}

	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
}
