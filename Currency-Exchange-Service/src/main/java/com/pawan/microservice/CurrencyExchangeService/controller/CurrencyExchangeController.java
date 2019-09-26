package com.pawan.microservice.CurrencyExchangeService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.microservice.CurrencyExchangeService.repositoy.CurrencyExchangeRepository;
import com.pawan.microservice.CurrencyExchangeService.repositoy.MyanmarCBCurencyXchangeRepository;
//import com.pawan.microservice.CurrencyExchangeService.repositoy.MyanmarCBCurencyXchangeRepository;
import com.pawan.microservice.CurrencyExchangeService.repositoy.MyanmarCBCustomerRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	@Autowired
	MyanmarCBCurencyXchangeRepository curencyXchangeRepository;
	
	@Autowired
	MyanmarCBCustomerRepository mcbcustomerRepository;
	
	@GetMapping("Currency-Exchange-Service/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to){
		
		CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to); 
				
			System.out.println("CurrencyExchange ::"+currencyExchange);	
				//new CurrencyExchange(1000L,from,to,71.47);
		currencyExchange.setPort(environment.getProperty("local.server.port"));
		return currencyExchange;
		
	}
	
	@GetMapping("getAllMCustomers")
	public List<MyanmarCBCustomerRecords> getAllMCBCustomerRecords(){
		List<MyanmarCBCustomerRecords> customerRecordslist =mcbcustomerRepository.findAll();
		System.out.println("CustomerRecordslist ::"+customerRecordslist);	
		return customerRecordslist;
		
	}
	
	
	@GetMapping("updateAmount/{currency}/{amount}")
	public String updateAmountOnMismatch(@PathVariable String currency,@PathVariable String amount){
		MyanmarCBCurencyXchange myanmarCBCurencyXchange =curencyXchangeRepository.findByCurrency(currency);
		System.out.println("MyanmarCBCurencyXchange Details::"+myanmarCBCurencyXchange);
		System.out.println("MyanmarCBCurencyXchange's Currency Rate ::"+myanmarCBCurencyXchange.getRate());	
		return myanmarCBCurencyXchange.getRate().toString();
		
	}
	
}
