package com.pawan.microservice.CurrencyConversionService.controller;

public class CurrencyConversionDTO {
	
	private Long currencyId;
	private String from;
	private String to;
	private Double conversionRate;
	private Integer quantity;
	private Double totalAmount;
	private String port;
	
	
	public CurrencyConversionDTO(){
		
	}

	public CurrencyConversionDTO(Long currencyId, String from, String to, Double conversionRate, Integer quantity,
			Double totalAmount, String port) {
		super();
		this.currencyId = currencyId;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
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


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	@Override
	public String toString() {
		return "CurrencyConversionDTO [currencyId=" + currencyId + ", from=" + from + ", to=" + to + ", conversionRate="
				+ conversionRate + ", quantity=" + quantity + ", totalAmount=" + totalAmount + ", port=" + port + "]";
	}

	

}
