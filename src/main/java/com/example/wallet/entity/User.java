package com.example.wallet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

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

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "user_id")
    private List<Account> accountList;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "user_id")
    private List<Report> reportList;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "user_id")
    private List<Budget> budgetList;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "user_id")
    private List<Contractor> contractorList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dateCreation=" + dateCreation +
                ", language='" + language + '\'' +
                ", accountList=" + accountList +
                ", reportList=" + reportList +
                ", budgetList=" + budgetList +
                ", contractorList=" + contractorList +
                '}';
    }
}
