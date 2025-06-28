package com.eazybytes.loans.service.impl;

import com.eazybytes.loans.constants.LoansConstants;
import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;
import com.eazybytes.loans.exception.LoanAlreadyExistsException;
import com.eazybytes.loans.exception.ResourceNotFoundException;
import com.eazybytes.loans.mapper.LoansMapper;
import com.eazybytes.loans.repository.LoansRepository;
import com.eazybytes.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {

    private LoansRepository loansRepository;

    /**
     * Creates a new loan for the given mobile number.
     * @param mobileNumber The unique mobile number of the customer whose loan is to be created.
     * @throws LoanAlreadyExistsException if a loan is already registered with the given mobile number.
     */
    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> optionalLoans= loansRepository.findByMobileNumber(mobileNumber);
        if(optionalLoans.isPresent()){
            throw new LoanAlreadyExistsException("Loan already registered with given mobileNumber "+mobileNumber);
        }
        loansRepository.save(createNewLoan(mobileNumber));
    }

    /**
     * Creates a new Loans object with a random loan number, the given mobile number,
     * default loan type, default total loan, and default amount paid.
     * @param mobileNumber The unique mobile number of the customer whose loan is to be created.
     * @return A new Loans object with the assigned loan number, mobile number, loan type, total loan, amount paid, and outstanding amount.
     */
    private Loans createNewLoan(String mobileNumber) {
        Loans newLoan = new Loans();
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        newLoan.setLoanNumber(Long.toString(randomLoanNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(LoansConstants.NEW_LOAN_LIMIT);
        return newLoan;
    }

    /**
     * Fetches the loan for the given mobile number.
     * @param mobileNumber The unique mobile number of the customer whose loan is to be fetched.
     * @return The LoansDto object containing the loan details.
     * @throws ResourceNotFoundException if no loan is found for the given mobile number.
     */
    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)
        );
        return LoansMapper.mapToLoansDto(loans, new LoansDto());
    }

    /**
     * Updates the loan for the given loan number.
     * Retrieves the existing loan information based on the provided loan number.
     * Updates the loan with the new information and saves it to the repository.
     *
     * @param loansDto The LoansDto object containing the updated loan details.
     * @return true if the update is successful, false otherwise.
     * @throws ResourceNotFoundException if no loan is found for the given loan number.
     */
    @Override
    public boolean updateLoan(LoansDto loansDto) {
        Loans loans = loansRepository.findByLoanNumber(loansDto.getLoanNumber()).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "LoanNumber", loansDto.getLoanNumber()));
        LoansMapper.mapToLoans(loansDto, loans);
        loansRepository.save(loans);
        return  true;
    }

    /**
     * Deletes the loan associated with the given mobile number.
     * @param mobileNumber The unique mobile number of the customer whose loan is to be deleted.
     * @return true if the loan is successfully deleted, false otherwise.
     * @throws ResourceNotFoundException if no loan is found for the given mobile number.
     */
    @Override
    public boolean deleteLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)
        );
        loansRepository.deleteById(loans.getLoanId());
        return true;
    }
}
