package com.pawan.microservice.CurrencyExchangeService.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MyanmarCBCurencyXchange")
public class MyanmarCBCurencyXchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	@Column(name="Currency")
	private String currency;
	@Column(name="Rate")
	private Double rate;
	
	
	public MyanmarCBCurencyXchange(){
		
	}
	
	
	public MyanmarCBCurencyXchange(Long id, String currency, Double rate) {
		super();
		this.id = id;
		currency = currency;
		this.rate = rate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		currency = currency;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}


	@Override
	public String toString() {
		return "MyanmarCBCurencyXchange [id=" + id + ", Currency=" + currency + ", rate=" + rate + "]";
	}
	
	
	

}
