package com.java8.consumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    static void printPersonDetails() {
        BiConsumer<String, List<String>> personConsumer = (name, hobbies) -> System.out.println(name +" "+hobbies);
        BiConsumer<String, Double> salaryConsumer = (name, salary) -> System.out.println(name +" "+salary);

        List<Person> personList = PersonRepository.getAllPersons();

        //personList.forEach(per -> personConsumer.accept(per.getName(), per.getHobbies()));
        personList.forEach(per -> {
            personConsumer.accept(per.getName(), per.getHobbies());
            salaryConsumer.accept(per.getName(), per.getSalary());
        });
    }

    public static void main(String[] args) {
        printPersonDetails();
    }
}
