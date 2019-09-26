package com.pawan.microservice.CurrencyExchangeService.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.pawan.microservice.CurrencyExchangeService.controller.CurrencyExchange;



@Repository
@Component
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	CurrencyExchange findByFromAndTo(String from ,String to);

	
	

}
