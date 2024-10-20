/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nidhinair
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    //Constructor
    public PersonDirectory(){
        this.personList = new ArrayList<>();
    }
    public void setPerson(ArrayList<Person> personList){
        this.personList = personList;
    }
    //Method to add person
    public Person addPerson(){
        Person p = new Person();
        personList.add(p);
        return p;
    }
    //Method to get list of persons
    public ArrayList<Person> getPersonList(){
        return personList;
    }
    //Method to delete person
    public void deletePerson(Person person){
         personList.remove(person);
    }
    public Person searchPerson(String keyword) {
    // Ensure that keyword is not null or empty
    if (keyword == null || keyword.isEmpty()) {
        return null; // Return null if the keyword is invalid
    }

    for (Person person : personList) {
        // Check if firstName is not null and matches the keyword
        if (person.getFirstName() != null && person.getFirstName().equalsIgnoreCase(keyword)) {
            return person;
        }

        // Check if lastName is not null and matches the keyword
        if (person.getLastName() != null && person.getLastName().equalsIgnoreCase(keyword)) {
            return person;
        }

        // Check if Home Street Address is not null and matches the keyword
        if (person.getHomeAddress().getStreetAddress() != null && person.getHomeAddress().getStreetAddress().equalsIgnoreCase(keyword)) {
            return person;
        }

        // Check if work street is not null and matches the keyword
        if (person.getWorkAddress().getStreetAddress() != null && person.getWorkAddress().getStreetAddress().equalsIgnoreCase(keyword)) {
            return person;
        }
    }

    return null; // Return null if no person matches the keyword
}

    
    
}
