package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    /**
     * Retrieves an account based on the customer's ID.
     *
     * @param customerId The ID of the customer whose account is to be retrieved.
     * @return An Optional containing the Accounts object if found, or an empty Optional if not.
     */
    Optional<Accounts> findByCustomerId(Long customerId);

}
