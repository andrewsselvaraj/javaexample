package com.exam.util;

/**
 * 
 */


/**
 * @author SJOSEP39
 *
 */
import java.util.ArrayList;

public class RemoveCollection {

    public static void main(String[] args) {

        ArrayList<Person1> originalPeople = new ArrayList<>();
        ArrayList<Person1> newPeople = new ArrayList<>();
        
        ArrayList<Person1> removePeople = new ArrayList<>();
        Person1 joe = new Person1("Jonathan", "Edwards");
        originalPeople.add(new Person1("William", "Tyndale"));
        originalPeople.add(joe);
        originalPeople.add(new Person1("Martin", null));
        originalPeople.add(new Person1(null, "Joe"));
        originalPeople.add(new Person1("Vijay", "Kommo"));

        newPeople.add(new Person1("Jonathan", "Edwards"));
        newPeople.add(new Person1("James", null));
        newPeople.add(new Person1("Roger", "Moore"));
        
       removePeople.add(joe);
        
        System.out.println("original size " + originalPeople.size());
        System.out.println("new size " + newPeople.size());
        
       originalPeople.remove(joe);
       
       
       newPeople.remove(removePeople);
       
       System.out.println("original size after removal " + originalPeople.size());
       System.out.println("new size removal " + newPeople.size());
       
    }
}

class Person1 {

    private final String firstName;
    private final String lastName;

    Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
