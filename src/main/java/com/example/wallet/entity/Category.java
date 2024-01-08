package com.example.wallet.entity;

import com.example.wallet.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private UUID id;
    @Column(name = "cat_name")
    private String name;
    @Column(name = "cat_type")
    private TransactionType type;
    @Column(name = "cat_parent_id")
    private Category parentId;
}
