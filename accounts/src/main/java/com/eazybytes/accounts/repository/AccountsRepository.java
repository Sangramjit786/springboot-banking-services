package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

    /**
     * Deletes the account associated with the given customer ID.
     *
     * @param customerId The ID of the customer whose account is to be deleted.
     */

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}
