package com.example.relation.adhishmodel;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class adhishStudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
}
