package com.pawan.microservice.CurrencyExchangeService.repositoy;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.pawan.microservice.CurrencyExchangeService.controller.CurrencyExchange;
import com.pawan.microservice.CurrencyExchangeService.controller.MyanmarCBCustomerRecords;


@Repository
@Component
public interface MyanmarCBCustomerRepository extends JpaRepository<MyanmarCBCustomerRecords, Long> {
	
	
	 List<MyanmarCBCustomerRecords> findAll();
		

	
	

}
