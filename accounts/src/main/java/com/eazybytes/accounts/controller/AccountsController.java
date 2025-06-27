package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.service.IAccountsService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class AccountsController {

    private IAccountsService iAccountsService;

    /**
     * Creates a new account for the given customer.
     * @param customerDto The CustomerDto object containing the customer details.
     * @return A ResponseEntity containing a ResponseDto with the HTTP status code
     *         and a message indicating the success or failure of the operation.
     */
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@Valid @RequestBody CustomerDto customerDto) {
        iAccountsService.createAccount(customerDto);
        return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
   }

    /**
     * Fetches the account details for the given mobile number.
     * @param mobileNumber The mobile number of the customer for whom the account details are being fetched.
     * @return A ResponseEntity containing the CustomerDto with the account details.
     */
    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam
                                                               @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
                                                               String mobileNumber) {
        CustomerDto customerDto = iAccountsService.fetchAccount(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(customerDto);
    }

    /**
     * Updates the account details for the given customer.
     * @param customerDto The CustomerDto object containing the updated customer details.
     * @return A ResponseEntity containing a ResponseDto with the HTTP status code
     *         and a message indicating the success or failure of the operation.
     *         Returns HTTP status OK if the update is successful,
     *         or EXPECTATION_FAILED if the update fails,
     *         or INTERNAL_SERVER_ERROR if an unexpected error occurs.
     */
    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateAccountDetails(@Valid @RequestBody CustomerDto customerDto) {
        boolean isUpdated = iAccountsService.updateAccount(customerDto);
        if(isUpdated) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDto(AccountsConstants.STATUS_200, AccountsConstants.MESSAGE_200));
        }else{
//            return ResponseEntity
//                    .status(HttpStatus.EXPECTATION_FAILED)
//                    .body(new ResponseDto(AccountsConstants.STATUS_417, AccountsConstants.MESSAGE_417_UPDATE));
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ResponseDto(AccountsConstants.STATUS_500, AccountsConstants.MESSAGE_500));
        }
    }

    /**
     * Deletes the account associated with the given mobile number.
     *
     * @param mobileNumber The mobile number of the customer whose account is to be deleted.
     * @return A ResponseEntity containing a ResponseDto with the HTTP status code
     *         and a message indicating the success or failure of the operation.
     *         Returns HTTP status OK if the account is successfully deleted,
     *         or EXPECTATION_FAILED if the deletion fails.
     */

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteAccountDetails(@RequestParam
                                                                @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
                                                                String mobileNumber) {
        boolean isDeleted = iAccountsService.deleteAccount(mobileNumber);
        if(isDeleted) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDto(AccountsConstants.STATUS_200, AccountsConstants.MESSAGE_200));
        }else{
//            return ResponseEntity
//                    .status(HttpStatus.EXPECTATION_FAILED)
//                    .body(new ResponseDto(AccountsConstants.STATUS_417, AccountsConstants.MESSAGE_417_DELETE));

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ResponseDto(AccountsConstants.STATUS_500, AccountsConstants.MESSAGE_500));
        }
    }
}
