package com.example.wallet.entity;

import com.example.wallet.entity.enums.Period;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.UUID;

public class Report {
    @Column
    private UUID id;
    @Column
    private String name;
    @Column
    private Period period;
    @Column
    private LocalDate dateStart;
    @Column
    private LocalDate dateEnd;
}
