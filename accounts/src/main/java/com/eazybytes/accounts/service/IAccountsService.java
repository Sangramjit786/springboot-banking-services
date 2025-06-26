package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

/* <<<<<<<<<<<<<<  ✨ Windsurf Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * This method will create a new account for the given customer.
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
