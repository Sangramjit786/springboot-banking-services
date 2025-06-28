package com.eazybytes.cards.repository;

import com.eazybytes.cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

    /**
     * Finds a card associated with the given mobile number.
     *
     * @param mobileNumber The unique mobile number of the customer.
     * @return An Optional containing the Cards object associated with the given mobile number if found, empty otherwise.
     */
    Optional<Cards> findByMobileNumber(String mobileNumber);

    /**
     * Finds a card associated with the given card number.
     *
     * @param cardNumber The card number of the card.
     * @return An Optional containing the Cards object associated with the given card number if found, empty otherwise.
     */
    Optional<Cards> findByCardNumber(String cardNumber);
}
