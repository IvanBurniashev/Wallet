package com.example.wallet.entity;

import com.example.wallet.entity.enums.TransactionType;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    @Column(name = "transaction_id")
    private UUID id;
    @Column(name = "tr_date_create")
    private LocalDate dateCreate;
    @Column(name = "tr_type")
    private TransactionType type;
    @Column(name = "tr_amount")
    private BigDecimal amount;
    @Column(name = "tr_comment")
    private String comment;
    @Column(name = "tr_link_to_receip")
    private String receipt;
}
