package com.example.wallet.entity;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User {
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
