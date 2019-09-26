package com.pawan.microservice.CurrencyExchangeService.repositoy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.pawan.microservice.CurrencyExchangeService.controller.MyanmarCBCurencyXchange;


@Repository
@Component
public interface MyanmarCBCurencyXchangeRepository extends JpaRepository<MyanmarCBCurencyXchange, Long> {
	
	MyanmarCBCurencyXchange findByCurrency(String currency);
	
	

}
