package com.pawan.microservice.CurrencyExchangeService.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CurrencyExchange")
public class CurrencyExchange {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long currencyId;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private Double conversionRate;
	private String port;
	
	
	public CurrencyExchange(){
		
	}

	

	
	public CurrencyExchange(Long currencyId, String from, String to, Double conversionRate, String port) {
		super();
		this.currencyId = currencyId;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.port = port;
	}




	public Long getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}

	
	

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public Double getConversionRate() {
		return conversionRate;
	}


	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [currencyId=" + currencyId + ", from=" + from + ", to=" + to + ", conversionRate="
				+ conversionRate + ", port=" + port + "]";
	}
	
}
