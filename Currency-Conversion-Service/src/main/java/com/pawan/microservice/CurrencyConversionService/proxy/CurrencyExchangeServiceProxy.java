/**
 * 
 */
package com.pawan.microservice.CurrencyConversionService.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.pawan.microservice.CurrencyConversionService.controller.CurrencyConversionDTO;


/**
 * @author Pawan.kumar
 *
 */

@FeignClient(name="Currency-Exchange-Service")
@RibbonClient(name="Currency-Exchange-Service")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("Currency-Exchange-Service/from/{from}/to/{to}")
	public CurrencyConversionDTO retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
	
	

}
