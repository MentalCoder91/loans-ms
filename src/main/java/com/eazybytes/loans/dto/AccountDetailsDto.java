package com.eazybytes.loans.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "accounts")
@Data
public class AccountDetailsDto{
	

	private String message;
	
	private Map<String, String> contact;
	
	private List<String> onCallSupport;
	

}
