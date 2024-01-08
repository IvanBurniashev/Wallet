package com.example.wallet.entity;

import com.example.wallet.entity.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

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

//    @Column(name = "user_id")
//    private User userId;
//    @Column(name = "currency_id")
//    private Currency currency;
}

