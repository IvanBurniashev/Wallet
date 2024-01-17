package com.example.wallet.entity;

import com.example.wallet.entity.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private UUID id;

    @Column(name = "ac_name")
    private String name;

    @Column(name = "ac_date_create")
    private LocalDate dateCreate;

    @Column(name = "ac_date_start")
    private LocalDate dateStart;

    @Column(name = "ac_date_recalculation")
    private LocalDate dateRecalculation;

    @Column(name = "ac_type")
    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Column(name = "ac_credit_rate")
    private short creditRate;

    @Column(name = "ac_deposit_rate")
    private short depositRate;

    @Column(name = "ac_balance")
    private BigDecimal balance;

    @OneToMany(mappedBy = "accounts", fetch = FetchType.LAZY, orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "account_id")
    private List<Transaction> transactionList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(dateCreate, account.dateCreate) && type == account.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateCreate, type);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateStart=" + dateStart +
                ", dateRecalculation=" + dateRecalculation +
                ", type=" + type +
                ", creditRate=" + creditRate +
                ", depositRate=" + depositRate +
                ", balance=" + balance +
                ", transactionList=" + transactionList +
                '}';
    }
}