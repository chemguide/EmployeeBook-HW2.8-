package com.example.EmployeeBookMap.hw28;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/test")
    public String test(@RequestParam(value = "call") String string) {
        return employeeService.test();
    }

    @RequestMapping("/add")
    public Person add(@RequestParam(value = "name") String name,
                      @RequestParam(value = "surname") String surname) {
        employeeService.addEmployee(name, surname);
        return new Person(name, surname);
    }

    @RequestMapping("/remove")
    public Person remove(@RequestParam(value = "name") String name,
                         @RequestParam(value = "surname") String surname) {
        employeeService.removeEmployee(name, surname);
        return new Person(name, surname);
    }

    @RequestMapping("/find")
    public Person find(@RequestParam(value = "name") String name,
                       @RequestParam(value = "surname") String surname) {
        employeeService.findEmployee(name, surname);
        return new Person(name, surname);
    }

    @RequestMapping("/print")
    public Map<String, Person> print() {
        return employeeService.printEmployees();
    }
}
