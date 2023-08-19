package com.spring.controller;

import com.spring.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restful")
public class PersonController {

    @GetMapping("/name")
    //http://localhost:8080/restful/name
    public String getName(){
        return "Muhammed Yasser";
    }

    @GetMapping("/po")
    public List<Person> getPerson(){
        List<Person> persons = new ArrayList<>();

        Person person1 = new Person(1,"Muhammed",22);
        Person person2 = new Person(2,"Mahmoud",22);
        Person person3 = new Person(3,"Ahmed",22);
        Person person4 = new Person(4,"Usama",22);
        Person person5 = new Person(5,"Islam",22);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        return persons;



    }@GetMapping("/getperson/{id}")
    //http://localhost:8080/restful/getperson/
    public Person getPersonById(@PathVariable("id") int id){
        Person person1 = new Person(1,"Muhammed",22);
        Person person2 = new Person(2,"Mahmoud",22);
        Person person3 = new Person(3,"Ahmed",22);
        Person person4 = new Person(4,"Usama",22);
        Person person5 = new Person(5,"Islam",22);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        return persons.get(id-1);


}
    @GetMapping("/getpersonbyid")
    //http://localhost:8080/restful/getpersonbyid?id=1
    public Person getPersonId(@RequestParam int id){
        Person person1 = new Person(1,"Muhammed",22);
        Person person2 = new Person(2,"Mahmoud",22);
        Person person3 = new Person(3,"Ahmed",22);
        Person person4 = new Person(4,"Usama",22);
        Person person5 = new Person(5,"Islam",22);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        return persons.get(id-1);
    }
}
