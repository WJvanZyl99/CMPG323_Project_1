package za.ac.nwu.logic.flow.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.logic.flow.FetchAccountTypeFlow;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
    @Override
    public List<AccountType> getAllAccountTypes() {
        List<AccountType> accountTypes = new ArrayList<>();
        accountTypes.add(new AccountType("Miles", LocalDate.now()));
        return accountTypes;
    }
}
