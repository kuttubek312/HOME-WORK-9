package com.peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("Person",Person.class);
        Animal animal = context.getBean("Animal",Dog.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        animal.animalIPIus();
    }
}
