package com.pawan.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.microservice.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	@GetMapping("/limits/hardvalue")
	public LimitConfiguration retrieveLimitsFromHardCodedValue() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(9, 999);
		return limitConfiguration;
	}

	
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
		return limitConfiguration;
	}

}
