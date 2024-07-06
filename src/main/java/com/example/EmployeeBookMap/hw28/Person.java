package com.example.EmployeeBookMap.hw28;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.getName()) && Objects.equals(surname, person.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }




}