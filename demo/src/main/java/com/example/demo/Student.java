package com.example.demo;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

//TODO create mongo repository to insert documents into collection

@Data
@Document

public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;

    public Student(String firstName, String lastName,
                   String email, Gender gender,
                   Address address, List<String> favourSubject,
                   BigDecimal totalSpent,
                   LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favourSubject = favourSubject;
        this.totalSpent = totalSpent;
        this.createdAt = createdAt;
    }

    private Address address;
    private List<String> favourSubject;
    private BigDecimal totalSpent;
    private LocalDateTime createdAt;



}
