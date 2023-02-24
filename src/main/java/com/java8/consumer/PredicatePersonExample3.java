package com.java8.consumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicatePersonExample3 {
    static Predicate<Person> p1 = per -> per.getHeight() >= 140;

    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static BiConsumer<String, List<String>> hobbiesConsumer = (name, hobbies) -> System.out.println(name + " " + hobbies);

    static Consumer<Person> personConsumer = per -> {
        if(p1.and(p2).test(per)) {
            hobbiesConsumer.accept(per.getName(), per.getHobbies());
        }
    };

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(personConsumer);
    }
}
