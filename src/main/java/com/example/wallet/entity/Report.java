package com.example.wallet.entity;

import com.example.wallet.entity.enums.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "reports")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "report_id")
    private UUID id;

    @Column(name = "rep_name")
    private String name;

    @Column(name = "rep_period")
    @Enumerated(EnumType.STRING)
    private Period period;

    @Column(name = "rep_date_start")
    private LocalDate dateStart;

    @Column(name = "rep_date_end")
    private LocalDate dateEnd;
}
