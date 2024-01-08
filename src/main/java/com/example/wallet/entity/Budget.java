package com.example.wallet.entity;

import com.example.wallet.entity.enums.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "budgets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "budget_id")
    private UUID id;
    @Column(name = "bud_name")
    private String name;
    @Column(name = "bud_one-time_flag")
    private boolean oneTime;
    @Column(name = "bud_date_create")
    private LocalDate dateCreate;
    @Column(name = "bud_period")
    private Period period;
    @Column(name = "bud_date_start")
    private LocalDate dateStart;
    @Column(name = "bud_date_end")
    private LocalDate dateEnd;
    @Column(name = "bud_income_amount")
    private BigDecimal incomeAmount;
    @Column(name = "bud_expense_amount")
    private BigDecimal expenseAmount;
}
