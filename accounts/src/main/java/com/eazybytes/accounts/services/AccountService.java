package com.eazybytes.accounts.services;

import com.eazybytes.accounts.dtos.CustomerDto;

public interface AccountService {
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccountDetails(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
