package com.milvik.user;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.milvik.account.Account;
import com.milvik.model.util.Traceability;

@Entity
@Table(name="mb_user")
public class User extends Traceability{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	private String mobileNo;
	
	@OneToMany(mappedBy="user", cascade= CascadeType.ALL, orphanRemoval=true, fetch =FetchType.LAZY)
	private List<Account> lstAccount;
	
	private int otp;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<Account> getLstAccount() {
		return lstAccount;
	}

	public void setLstAccount(List<Account> lstAccount) {
		this.lstAccount = lstAccount;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
}
