package com.cheehong.domain;

import java.util.Date;

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
@DiscriminatorValue("PAYACCOUNT")
public class PayAccount extends BankAccount {
	
	private long ID;
	private Date dateOfTransfer;

	@Id 
	@GeneratedValue 
	@Column(name="ID") 
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}
	
	@Column(name="DATE_OF_TRANSFER") 
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}

	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
}
