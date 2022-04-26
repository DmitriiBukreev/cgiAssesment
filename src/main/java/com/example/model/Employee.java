package com.example.model;

import lombok.*;

import javax.persistence.*;
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
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Name can not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 chars")
    private String name;

    @NotEmpty(message = "Last can not be empty")
    private String lastname;

    @Enumerated(EnumType.STRING)
    private Department department;
}
