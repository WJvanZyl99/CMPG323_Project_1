package za.ac.nwu.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.repo.persistence.AccountTypeRepository;
import za.ac.nwu.translator.AccountTypeTranslator;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTypeTranslatorImpl implements AccountTypeTranslator {

    @Autowired
    private AccountTypeRepository accountTypeRepository;

    @Override
    public List<AccountType> getAllAccountTypes() {
        List<AccountType> accountTypes = new ArrayList<>();

        try {
            for (AccountType accountType : accountTypeRepository.findAll()) {
                accountTypes.add((accountType));
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to read from DB!", e);
        }

        return accountTypes;
    }
}
