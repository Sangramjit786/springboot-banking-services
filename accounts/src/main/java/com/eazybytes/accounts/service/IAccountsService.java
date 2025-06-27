package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * This method will create a new account for the given customer.
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches the account for the given mobile number.
     * @param mobileNumber - Unique mobile number of the customer.
     * @return The CustomerDto object containing the account details.
     */
    CustomerDto fetchAccount(String mobileNumber);
}
