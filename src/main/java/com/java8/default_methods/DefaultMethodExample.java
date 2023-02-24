package com.java8.default_methods;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> nameList = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Before Sort");
        nameList.forEach(name -> System.out.println(name));
        Collections.sort(nameList);
        System.out.println("After Sort");
        nameList.forEach(name -> System.out.println(name));
        System.out.println("Natural Order");
        nameList.sort(Comparator.naturalOrder());
        nameList.forEach(name -> System.out.println(name));
        System.out.println("Reverse Order");
        nameList.sort(Comparator.reverseOrder());
        nameList.forEach(name -> System.out.println(name));
    }
}
