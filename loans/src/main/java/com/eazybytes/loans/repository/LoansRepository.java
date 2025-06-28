package com.eazybytes.loans.repository;

import com.eazybytes.loans.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long> {
    /**
     * Finds a Loans by mobile number.
     * @param mobileNumber The mobile number
     * @return An Optional containing the Loans if found, empty otherwise
     */
    Optional<Loans> findByMobileNumber(String mobileNumber);

    /**
     * Finds a Loans by loan number.
     * @param loanNumber The loan number
     * @return An Optional containing the Loans if found, empty otherwise
     */
    Optional<Loans> findByLoanNumber(String loanNumber);
}
