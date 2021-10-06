package za.ac.nwu.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.domain.persistence.AccountTransaction;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.domain.persistence.Member;
import za.ac.nwu.repo.persistence.AccountTransactionRepository;
import za.ac.nwu.translator.AccountTransactionTranslator;
import java.util.ArrayList;
import java.util.List;

public class AccountTransactionTranslatorImpl implements AccountTransactionTranslator {

    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    @Override
    public List<AccountTransaction> getAccountTransactions(AccountType accountType) {
        //TODO getAccountTransactions(AccountType accountType)
        return null;
    }

    @Override
    public List<AccountTransaction> getAllTransactions() {
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

    @Override
    public List<AccountTransaction> getMemberTransactions(Member member) {
        //TODO getMemberTransactions(Member member)
        return null;
    }

    @Override
    public List<AccountTransaction> getMemberAccountTransactions(Member member, AccountType accountType) {
        //TODO getMemberAccountTransactions(Member member, AccountType accountType)
        return null;
    }
}
