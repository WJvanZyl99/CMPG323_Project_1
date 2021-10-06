package za.ac.nwu.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.logic.flow.FetchAccountTypes;
import za.ac.nwu.translator.AccountTypeTranslator;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypesImpl implements FetchAccountTypes {

    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypesImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountType> getAllAccountTypes() {
        return accountTypeTranslator.getAllAccountTypes();
    }
}
