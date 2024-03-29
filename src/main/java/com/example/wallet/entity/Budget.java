package com.example.wallet.entity;

import com.example.wallet.entity.enums.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
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
    @Enumerated(EnumType.STRING)
    private Period period;

    @Column(name = "bud_date_start")
    private LocalDate dateStart;

    @Column(name = "bud_date_end")
    private LocalDate dateEnd;

    @Column(name = "bud_income_amount")
    private BigDecimal incomeAmount;

    @Column(name = "bud_expense_amount")
    private BigDecimal expenseAmount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Budget budget = (Budget) o;
        return Objects.equals(id, budget.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oneTime=" + oneTime +
                ", dateCreate=" + dateCreate +
                ", period=" + period +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", incomeAmount=" + incomeAmount +
                ", expenseAmount=" + expenseAmount +
                '}';
    }
}
