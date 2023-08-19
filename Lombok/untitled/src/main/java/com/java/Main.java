package com.java;

import lombok.Builder;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(1,"Muhmmed",22,Gender.Male);
        System.out.println(person.toString());
        Person person1 = Person.builder().id(1).name("Muhmmed").age(22).gender(Gender.Male).build();
        System.out.println(person1.toString());

        System.out.println(person.equals(person1));
        Person person2 = null;
        person2.toString();








    }

}