package com.example.wallet.entity;

import com.example.wallet.entity.enums.Period;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Budget {
    @Column
    private UUID id;
    @Column
    private String name;
    @Column
    private boolean oneTime;
    @Column
    private Period period;
    @Column
    private LocalDate dateStart;
    @Column
    private LocalDate dateEnd;
    @Column
    private BigDecimal incomeAmount;
    @Column
    private BigDecimal expenseAmount;
}
