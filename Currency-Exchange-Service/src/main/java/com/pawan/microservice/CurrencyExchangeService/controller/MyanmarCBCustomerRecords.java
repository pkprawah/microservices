package com.pawan.microservice.CurrencyExchangeService.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MyanmarCBCustomerRecords")
public class MyanmarCBCustomerRecords {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="Id")
	private Long id;
	
	@Column(name="CustomerNo")
	private String customerNo;
	
	@Column(name="Currency")
	private String currency;
	
	@Column(name="Amount")
	private Double amount;
	
	
	public MyanmarCBCustomerRecords(){
		
	}
	

	public MyanmarCBCustomerRecords(Long id, String customerNo, String currency, Double amount) {
		super();
		this.id = id;
		this.customerNo = customerNo;
		this.currency = currency;
		this.amount = amount;
	}






	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustomerNo() {
		return customerNo;
	}


	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "MyanmarCBCustomerRecords [id=" + id + ", customerNo=" + customerNo + ", currency=" + currency
				+ ", amount=" + amount + "]";
	}
	
	
	
	
}
