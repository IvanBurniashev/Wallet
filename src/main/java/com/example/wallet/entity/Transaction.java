package com.example.wallet.entity;

import com.example.wallet.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
