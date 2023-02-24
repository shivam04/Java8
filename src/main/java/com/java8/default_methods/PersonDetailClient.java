package com.java8.default_methods;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.List;

public class PersonDetailClient {
    static List<Person> listOfPersons = PersonRepository.getAllPersons();

    public static void main(String[] args) {
        PersonDetails pd = new PersonDetailImpl();
        System.out.println("Total Salary :" + pd.calculateTotalSalary(listOfPersons));
        System.out.println("Total Kids Count :" + pd.totalKids(listOfPersons));
        PersonDetails.personNames(listOfPersons).forEach(System.out::println);
        PersonDetailImpl.personNames(listOfPersons).forEach(System.out::println);
    }
}
