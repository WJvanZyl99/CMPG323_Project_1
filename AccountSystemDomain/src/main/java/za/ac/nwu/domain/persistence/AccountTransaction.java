package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "account_transactions", indexes = {
        @Index(name = "FK_Member_Members_idx", columnList = "member_id"),
        @Index(name = "FK_AccountType_AccountTypes_idx", columnList = "account_type")
})
@Entity
public class AccountTransaction {

    public AccountTransaction() {
    }

    public AccountTransaction(AccountType accountType, Member member, Integer amount, LocalDate transactionDate) {
        this.accountType = accountType;
        this.member = member;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_transaction_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_type")
    private AccountType accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(id, that.id) && Objects.equals(accountType, that.accountType) && Objects.equals(member, that.member) && Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountType, member, amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", member=" + member +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}