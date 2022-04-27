package com.example.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Employee {


    @NotEmpty(message = "Name can not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 chars")

    private String name;

    @NotEmpty(message = "Lastname can not be empty")
    private String lastname;

    @NotEmpty(message = "Last can not be empty")
    private String birthdate;

    @Enumerated(EnumType.STRING)
    private Department department;

    @Id
    private Long id;


    public Long getId() {
        return id;
    }
}
