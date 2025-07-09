package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    /**
     * Fetches the customer details for the given mobile number.
     * @param mobileNumber The unique mobile number of the customer for whom the customer details are being fetched.
     * @param correlationId The correlation id to be used for logging.
     * @return The CustomerDetailsDto object containing the customer details.
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
