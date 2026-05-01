package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Person class
class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Comparator for Name (Case-Insensitive)
class NameComparator implements Comparator<Person2> {
    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.name.compareToIgnoreCase(o2.name);
    }
}

// Comparator for Age
class AgeComparator implements Comparator<Person2> {
    @Override
    public int compare(Person2 o1, Person2 o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

// Main class
public class Comparatordemo {
    public static void main(String[] args) {

        ArrayList<Person2> obj = new ArrayList<>();

        obj.add(new Person2("Rashmi", 26));
        obj.add(new Person2("Kusuma", 20));
        obj.add(new Person2("Rashi", 23));
        obj.add(new Person2("Hushmi", 16));

        // Sort by Name
        Collections.sort(obj, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Person2 p : obj) {
            p.display();
        }

        System.out.println();

        // Sort by Age
        Collections.sort(obj, new AgeComparator());
        System.out.println("Sorted by Age:");
        for (Person2 p : obj) {
            p.display();
        }
    }
}