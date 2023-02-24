package com.java8.default_methods;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.Comparator;
import java.util.List;

public class DefaultCustomSortExample {
    static Comparator<Person> c1 = Comparator.comparing(Person::getName);
    static Comparator<Person> c2 = Comparator.comparingDouble(Person :: getHeight);


    public static void main(String[] args) {
        List<Person> listOfPersons = PersonRepository.getAllPersons();
        sortByName(listOfPersons);
        sortByHeight(listOfPersons);
        sortByHeightandName(listOfPersons);
        sortByNameWithNull(listOfPersons);
        sortByNameWithNullLast(listOfPersons);
    }

    static void sortByName(List<Person> listOfPersons) {
        System.out.println("sortByName");
        listOfPersons.sort(c1);
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByHeight(List<Person> listOfPersons) {
        System.out.println("sortByHeight");
        listOfPersons.sort(c2);
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByHeightandName(List<Person> listOfPersons) {
        System.out.println("sortByHeightandName");
        listOfPersons.sort(c1.thenComparing(c2));
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByNameWithNull(List<Person> listOfPersons) {
        System.out.println("sortByNameWithNull");
        Comparator<Person> nullComp = Comparator.nullsFirst(c1);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByNameWithNullLast(List<Person> listOfPersons) {
        System.out.println("sortByNameWithNullLast");
        Comparator<Person> nullComp = Comparator.nullsLast(c1);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(per -> System.out.println(per));
    }

}
