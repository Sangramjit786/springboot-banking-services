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
     */

    boolean deleteAccount(String mobileNumber);


    /**
     * Updates the communication status for the given account number.
     *
     * @param accountNumber The account number for which the communication status is to be updated.
     * @return true if the communication status is successfully updated, false otherwise.
     */

    boolean updateCommunicationStatus(Long accountNumber);
}
