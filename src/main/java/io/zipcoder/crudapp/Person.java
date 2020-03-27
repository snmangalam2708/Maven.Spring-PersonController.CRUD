package io.zipcoder.crudapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    String firstName;
    String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, int id){

        this(firstName,lastName);
        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

}