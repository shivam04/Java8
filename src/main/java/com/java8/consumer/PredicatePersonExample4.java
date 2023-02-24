package com.java8.consumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class PredicatePersonExample4 {
    static BiPredicate<Integer, String>  p3 = (height, gender) -> height >= 140 && gender.equals("Male");

    static BiConsumer<String, List<String>> hobbiesConsumer = (name, hobbies) -> System.out.println(name + " " + hobbies);

    static Consumer<Person> personConsumer = per -> {
        if(p3.test(per.getHeight(), per.getGender())) {
            hobbiesConsumer.accept(per.getName(), per.getHobbies());
        }
    };

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(personConsumer);
    }
}
