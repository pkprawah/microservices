package com.pawan.microservice.CurrencyConversionService.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.pawan.microservice.CurrencyConversionService.controller.CurrencyConversionDTO;
import com.pawan.microservice.CurrencyConversionService.proxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionDTO convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable int quantity){
		
		// Code duplicate problem --remove by Feign concept  
		Map<String,String> uriVariables =new HashMap<String,String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionDTO> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/exchange/from/{from}/to/{to}",CurrencyConversionDTO.class , uriVariables);
		System.out.println("CurrencyExchange response Entity ::"+responseEntity);
		CurrencyConversionDTO response =responseEntity.getBody();
		System.out.println("CurrencyExchange ::"+response);
		int i =Math.multiplyExact(quantity, response.getConversionRate().intValue());
		Double d =new Double(i);
		CurrencyConversionDTO currencyConversionDto =new CurrencyConversionDTO(response.getCurrencyId(),from,to,response.getConversionRate(),quantity,d,response.getPort());
		currencyConversionDto.setPort(environment.getProperty("local.server.port"));
		System.out.println("CurrencyExchange ::"+currencyConversionDto);	
		return currencyConversionDto;
		
		// Code duplicate problem --remove by Feign concept  
		
	}
	
	
	@GetMapping("currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionDTO convertCurrencyFeign(@PathVariable String from,@PathVariable String to,@PathVariable int quantity){
		CurrencyConversionDTO response =proxy.retrieveExchangeValue(from,to);
		System.out.println("CurrencyExchange ::"+response);
		int i =Math.multiplyExact(quantity, response.getConversionRate().intValue());
		Double d =new Double(i);
		CurrencyConversionDTO currencyConversionDto =new CurrencyConversionDTO(response.getCurrencyId(),from,to,response.getConversionRate(),quantity,d,response.getPort());
		//currencyConversionDto.setPort(environment.getProperty("local.server.port"));
		System.out.println("CurrencyExchange ::"+currencyConversionDto);	
		return currencyConversionDto;
		
	}
	
	
	

}
