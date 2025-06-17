package com.example.fastxprojdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BusOperator {
	@Id
    private int id;
    private int userId;
    private String companyName;

    public BusOperator() {}

    public BusOperator(int id, int userId, String companyName) {
        this.id = id;
        this.userId = userId;
        this.companyName = companyName;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "BusOperator [id=" + id + ", userId=" + userId + ", companyName=" + companyName + "]";
	}


}
