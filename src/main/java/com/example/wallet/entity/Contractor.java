package com.example.wallet.entity;

import jakarta.persistence.Column;

import java.util.UUID;

public class Contractor {
    @Column
    private UUID id;
    @Column
    private String name;

}
