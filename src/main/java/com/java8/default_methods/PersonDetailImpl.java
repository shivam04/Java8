package com.java8.default_methods;

import com.java8.repo.Person;

import java.util.Arrays;
import java.util.List;

public class PersonDetailImpl implements PersonDetails{
    @Override
    public double calculateTotalSalary(List<Person> personList) {
        return personList.stream()
                .map(Person::getSalary)
                .reduce(0.0, (x,y)->x+y);
    }

    public int totalKids(List<Person> personList) {
        return (10+10);
    }

    static List<String> personNames(List<Person> listOfPersons) {
        return Arrays.asList("One", "Two");
    }
}
