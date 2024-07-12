package com.example.EmployeeBookMap.hw28;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final int employeeNumber = 10;
    Map<String, Person> employees = new HashMap<>();

    public void addEmployee(String name, String surname) {
        String id = name + surname;
        if (employees.size() >= employeeNumber) {
            throw new EmployeeStorageIsFullException();
        }
        if (employees.containsKey(id)) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(id, new Person(name, surname));
    }

    public void removeEmployee(String name, String surname) {
        String id = name + surname;
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(id);
    }

    public void findEmployee(String name, String surname) {
        String id = name + surname;
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException();
        }
    }

    public Map<String, Person> printEmployees() {
        return employees;
    }

    public String test() {
        return "testing";
    }
}
