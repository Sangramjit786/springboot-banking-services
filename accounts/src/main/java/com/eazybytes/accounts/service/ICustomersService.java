package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

/* <<<<<<<<<<<<<<  ✨ Windsurf Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Fetches the customer details for the given mobile number.
     * @param mobileNumber The unique mobile number of the customer for whom the customer details are being fetched.
     * @return The CustomerDetailsDto object containing the customer details.
     */
/* <<<<<<<<<<  ff5fbbeb-f0f1-49ac-9670-d47a9d5bb95d  >>>>>>>>>>> */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
