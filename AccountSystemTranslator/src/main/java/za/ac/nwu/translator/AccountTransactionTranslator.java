package za.ac.nwu.translator;

import za.ac.nwu.domain.persistence.AccountTransaction;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.domain.persistence.Member;

import java.util.List;

public interface AccountTransactionTranslator {
    List<AccountTransaction> getAccountTransactions(AccountType accountType);
    List<AccountTransaction> getAllTransactions();
    List<AccountTransaction> getMemberTransactions(Member member);
    List<AccountTransaction> getMemberAccountTransactions(Member member, AccountType accountType);
}
