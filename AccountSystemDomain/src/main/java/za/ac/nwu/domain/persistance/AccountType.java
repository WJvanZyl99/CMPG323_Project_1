package za.ac.nwu.domain.persistance;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "account_types")
@Entity
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_type_id", nullable = false)
    private Integer id;

    @Column(name = "account_type", length = 45)
    private String accountType;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}