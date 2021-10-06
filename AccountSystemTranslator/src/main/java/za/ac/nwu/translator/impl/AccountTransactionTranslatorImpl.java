package za.ac.nwu.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.domain.persistence.AccountTransaction;
import za.ac.nwu.repo.persistence.AccountTransactionRepository;
import za.ac.nwu.translator.AccountTransactionTranslator;
import java.util.ArrayList;
import java.util.List;

public class AccountTransactionTranslatorImpl implements AccountTransactionTranslator {

    private final AccountTransactionRepository accountTransactionRepository;

    @Autowired
    public AccountTransactionTranslatorImpl(AccountTransactionRepository accountTransactionRepository) {
        this.accountTransactionRepository = accountTransactionRepository;
    }

    @Override
    public List<AccountTransaction> getAllAccountTransactions() {
        List<AccountTransaction> accountTransactions = new ArrayList<>();

        try {
            for (AccountTransaction accountTransaction : accountTransactionRepository.findAll()) {
                accountTransactions.add((accountTransaction));
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to read from DB!", e);
        }

        return accountTransactions;
    }
}
