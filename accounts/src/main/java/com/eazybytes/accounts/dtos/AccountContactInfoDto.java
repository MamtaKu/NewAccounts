package com.eazybytes.accounts.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
//public record AccountContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
//
//}
public class AccountContactInfoDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;


}
