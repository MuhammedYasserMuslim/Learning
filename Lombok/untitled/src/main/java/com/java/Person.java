package com.java;

import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
@NonNull
public class Person {
    private int id;
    private String name;
    private int age;
    private Gender gender;


}