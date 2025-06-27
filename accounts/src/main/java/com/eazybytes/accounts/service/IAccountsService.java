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

    /**
     * Updates the account for the given customer.
     * @param customerDto - CustomerDto Object
     * @return true if update is successful, false otherwise
     */
    boolean updateAccount(CustomerDto customerDto);


    /**
     * Deletes the account associated with the given mobile number.
     *
     * @param mobileNumber The unique mobile number of the customer whose account is to be deleted.
     * @return true if the account is successfully deleted, false otherwise.
     * @throws ResourceNotFoundException if the customer or account does not exist.
     */

    boolean deleteAccount(String mobileNumber);
}
