package com.example.EmployeeBookMap.hw28;

import java.util.Map;

public interface EmployeeService {
    void addEmployee(String name, String surname);

    void removeEmployee(String name, String surname);

    void findEmployee(String name, String surname);

    Map<String, Person> printEmployees();

    String test();
}
