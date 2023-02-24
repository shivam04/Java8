package com.java8.consumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<String, String, String>  bf1 = (a, b) -> (a + " " + b);

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;

    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> bf2 = (listOfPersons, predicate) -> {
        Map<String, Double> map = new HashMap<>();
        listOfPersons.forEach(person -> {
            if(p1.and(predicate).test(person)) {
                map.put(person.getName(), person.getSalary());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println("Result: " + bf1.apply("Java", "features"));
        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, Double> map = bf2.apply(personList, p2);
        System.out.println(map);
    }
}
