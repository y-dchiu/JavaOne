package com.xpanxion.assignments.student.JavaOneII;

public class Person {
    private String firstName, lastName;
    private int id;

    public Person(int id, String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getId(){
        return this.id;
    }

    public String toString() {
        return "Person{id=" + this.id + ", firstName='" + this.firstName + "', lastName='" + this.lastName + "'}";
    }
}
