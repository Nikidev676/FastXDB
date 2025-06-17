package com.example.fastxprojdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_accounts")
public class UserAccount {

	@Id
	private String email;
	private String password;
	private String fullName;
	private String phone;
	private String address;
	private String gender;
	private String accountType;

	public UserAccount() {
		super();
	}

	public UserAccount(String email, String password, String fullName, String phone, String address, String gender,
			String accountType) {
		super();
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.accountType = accountType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Register [email=" + email + ", password=" + password + ", fullname=" + fullName + ", phone=" + phone
				+ ", address=" + address + ", gender=" + gender + ", accountType=" + accountType + "]";
	}
}
