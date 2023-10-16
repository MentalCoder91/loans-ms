package com.eazybytes.loans.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "accounts")
public record AccountDetailsDto(String message,Map<String,String> contact,List<String> onCallSupport) {

}
