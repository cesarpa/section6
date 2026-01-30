package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;

public interface IAccountsService {

    /**
     * Create Account for Customer
     * @param customerDTO
     */
    void createAccount(CustomerDTO customerDTO);


    /**
     * Fetch Account Details for Customer
     * @param mobileNumber
     * @return CustomerDTO
     */
    CustomerDTO fetchAccountDetails(String mobileNumber);

    /**
     * Update Account for Customer
     * @param customerDTO
     * @return boolean
     */
    boolean updateAccount(CustomerDTO customerDTO);

    /**
     * Delete Account for mobileNumber
     * @param mobileNumber
     * @return boolean
     */
    boolean deleteAccount(String mobileNumber);
}
