package com.milvik.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.milvik.model.util.Traceability;
import com.milvik.user.User;

@Entity
public class Account extends Traceability{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long accountId;
	
	private String accountNumber;
	
	private String accHolderName;
	
	@ManyToOne
	@JoinColumn(name= "user_id")
	private User user;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
