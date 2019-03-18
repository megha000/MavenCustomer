package com.lti.finance.dto;

import java.sql.Date;

import com.lti.finance.entity.Register;

public class EmiCard {
	private int id;
	private String type;
	private int min_limit;
	private Date valid_upto;
	private int cvv;
	public long getCard_id() {
		return card_id;
	}

	public void setCard_id(long card_id) {
		this.card_id = card_id;
	}

	private long card_id;
private Register register;
	
	public Register getRegister() {
	return register;
}

public void setRegister(Register register) {
	this.register = register;
}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMin_limit() {
		return min_limit;
	}

	public void setMin_limit(int min_limit) {
		this.min_limit = min_limit;
	}

	public Date getValid_upto() {
		return valid_upto;
	}

	public void setValid_upto(Date valid_upto) {
		this.valid_upto = valid_upto;
	}
}
