package com.eazybytes.loans.dto;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "account-address")
public record AccountAddressDto(String branch,String pinCode,String city) {

}
