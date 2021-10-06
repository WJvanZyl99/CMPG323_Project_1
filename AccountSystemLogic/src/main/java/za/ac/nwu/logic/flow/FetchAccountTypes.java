package za.ac.nwu.logic.flow;

import za.ac.nwu.domain.persistence.AccountType;
import java.util.List;

public interface FetchAccountTypes {
    List<AccountType> getAllAccountTypes();
}
