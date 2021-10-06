package za.ac.nwu.translator;

import za.ac.nwu.domain.persistence.AccountType;
import java.util.List;

public interface AccountTypeTranslator {
    List<AccountType> getAllAccountTypes();
}
