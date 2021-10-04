package za.ac.nwu.domain.persistance;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "account_transactions")
@Entity
public class AccountTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_transaction_id", nullable = false)
    private Integer id;

    @Column(name = "account_type")
    private Integer accountType;

    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}