/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Person_with_exceptions;

import com.mycompany.Person_with_exceptions.Exceptions.InvalidValueException;
import com.mycompany.Person_with_exceptions.Exceptions.PropertyNotInitializedException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roger
 */
public class EmployeeTester {

    private Employee employee;
    private final String CORRECT = "0";
    private final String INCORRECT = "1";

    public void constructorWithPersona(Person p) {
        String description = "Constructor with person: ";
        String result = INCORRECT;
        employee = new Employee(p);
        try {
            if (employee.getName().equals(p.getName()) && employee.getAge() == p.getAge() && employee.getNif().equals(p.getNif())) {
                result = CORRECT;
            }
        } catch (PropertyNotInitializedException ex) {
            System.out.println(ex.getMessage());;
        } catch (InvalidValueException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(description + result);
    }

    public void constructorFullParameters(Person p, Double salary, String job, String department,int incomePerYear) {
        String description = "Constructor with full parameter: ";
        String result = INCORRECT;

        employee = new Employee(p, salary, job, department, incomePerYear);
        try {
            if (employee.getName().equals(p.getName()) && 
                employee.getAge() == p.getAge() && 
                employee.getNif().equals(p.getNif()) &&
                employee.getSalary() == salary &&
                employee.getDepartment().equals(department) &&
                employee.getJob().equals(job) &&
                employee.getIncomePerYear() == incomePerYear){
                result = CORRECT;
            }
        } catch (PropertyNotInitializedException ex) {
            System.out.println(ex.getMessage());;
        } catch (InvalidValueException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(description + result);
    }

    public static void main(String[] args) throws InvalidValueException {
        EmployeeTester et = new EmployeeTester();
        et.constructorWithPersona(new Person("12345678Z", "Roger", 20));
        et.constructorFullParameters(new Person("12345678Z", "Roger", 20), 300d, "oficinista", "Direcció", 30000);
    }

}
