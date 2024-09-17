package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ir.freeland.collection.model.Address;
import ir.freeland.collection.model.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class ListCreate {
    Person mas = new Person("mas", "rad", 123, new Address("tehran", "iran", "mirdamad"));
    Person sam = new Person("sam", "zarif", 13, new Address("rasht", "iran", "shahrdari"));
    Person lili = new Person("lili", "alipor", 12, new Address("shiraz", "iran", "hafezie"));
    Person ali = new Person("ali", "asadi", 12, new Address("tehran", "iran", "mirdamad"));
    List<Person> persons = new ArrayList<>();

    public List<Person> addPerson() {
        persons.add(mas);
        persons.add(sam);
        persons.add(lili);
        persons.add(ali);
        return persons;
    }

    public void printPerson(List<Person> p) {
        p.forEach(System.out::println);
    }




}
