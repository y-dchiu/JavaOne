package com.xpanxion.assignments.student.JavaOneII;

public class Repository implements DataAccess{
    public Person getPerson() {
        return new Person(1, "John", "Doe");
    }
}
