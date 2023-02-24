package com.java8.consumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample3 {
    static Consumer<Person> c1 = (p) -> System.out.println(p);

    static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());

    static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
    static List<Person> personList = PersonRepository.getAllPersons();

    static void printNameAndHobbies() {
        personList.forEach(c1.andThen(c2));
    }

    static void printWithCondition() {
        personList.forEach(p -> { // iterate student
            if(p.getGender().equals("Male") && p.getHeight() >=140) {
                c2.andThen(c3).accept(p);
            }
        });
    }

    public static void main(String[] args) {
        //List<Person> personList = PersonRepository.getAllPersons();
        //c1.accept(PersonRepository.getPerson());
        //c2.accept(PersonRepository.getPerson());
        //c3.accept(PersonRepository.getPerson());
        //c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());
        //printNameAndHobbies();
        printWithCondition();
    }
}
