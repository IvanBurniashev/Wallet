package com.example.wallet.entity;

import com.example.wallet.entity.enums.TransactionType;
import jakarta.persistence.Column;

import java.util.UUID;

public class Category {
    @Column
    private UUID id;
    @Column
    private String name;
    @Column
    private TransactionType type;
    @Column
    private Category parentId;
}
