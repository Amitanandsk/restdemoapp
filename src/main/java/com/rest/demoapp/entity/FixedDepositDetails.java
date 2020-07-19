package com.rest.demoapp.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class FixedDepositDetails {
	@Id
	private int id;
	private long depositAmount;
	private Date maurityDate;

	public long getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(long depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Date getMaurityDate() {
		return maurityDate;
	}

	public void setMaurityDate(Date maurityDate) {
		this.maurityDate = maurityDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
