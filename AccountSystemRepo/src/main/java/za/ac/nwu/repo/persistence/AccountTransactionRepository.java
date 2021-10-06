package za.ac.nwu.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.domain.persistence.AccountTransaction;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Integer> {

}
