package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    /**
     * Maps a Customer entity to a CustomerDto.
     * @param customer The Customer entity to map.
     * @param customerDto The CustomerDto to map to.
     * @return The mapped CustomerDto.
     */
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    /**
     * Maps a CustomerDto to a Customer entity.
     * @param customerDto The CustomerDto to map from.
     * @param customer The Customer entity to map to.
     * @return The mapped Customer entity.
     */

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
