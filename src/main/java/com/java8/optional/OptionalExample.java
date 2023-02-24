package com.java8.optional;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        System.out.println("Result :"+myName("John"));
        Optional<String> name = Optional.ofNullable(myName("John"));
        String name1 = Optional.ofNullable(myName("John")).get();
        System.out.println(name.isPresent() ? name.get():"No Data Found");
        System.out.println("Person Name :"+personName(new Person()));
        Optional<String> personName = personNameWithOptional(PersonRepository.getPersonOptional());
        System.out.println("The Optional Person Name is :" + personName.get());
        Optional<String> personName1 = personNameWithOptional(Optional.empty());
        System.out.println("The Optional Person Name1 is :" + personName1.get());

    }

    static String myName(String name) {
        return name;
    }

    static String personName(Person per) {
        if(per!=null)
            return per.getName();
        else
            return "No Data Found";
    }

    static Optional<String> personNameWithOptional(Optional<Person> per){
        if(per.isPresent())
            return per.map(Person :: getName);
        else
            return Optional.empty();
    }
}
