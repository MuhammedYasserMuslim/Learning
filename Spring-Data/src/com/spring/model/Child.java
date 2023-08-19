package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private int age;

    private String address;


    @ManyToOne
    @JoinColumn(name="person_id")
    private  Person person;

    @ManyToOne
    @JoinColumn(name = "my_mother")
    private Wife wife;
}
