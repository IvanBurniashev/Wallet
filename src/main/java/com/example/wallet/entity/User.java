package com.example.wallet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private UUID id;
    @Column(name = "us_name")
    private String name;
    @Column(name = "us_password")
    private String password;
    @Column(name = "us_e-mail")
    private String email;
    @Column(name = "us_date_creation")
    private LocalDate dateCreation;
    @Column(name = "us_language")
    private String language;
    private List<Account> accountList;
}
