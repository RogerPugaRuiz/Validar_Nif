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

    public void constructorWithPersonTester(Person p) {
        String description = "Constructor with person: ";
        String result = INCORRECT;
        employee = new Employee(p);
        try {
            if (employee.getName().equals(p.getName()) && 
                    employee.getAge() == p.getAge() && 
                    employee.getNif().equals(p.getNif())) {
                result = CORRECT;
            }
        } catch (PropertyNotInitializedException ex) {
            System.out.println(ex.getMessage());;
        } catch (InvalidValueException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(description + result);
    }

    public void constructorFullParametersTester(Person p, Double salary, 
            String job, String department,int incomePerYear) {
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
    
    public void constructorWithEmployeeTester(Employee e){
        String description = "Constructor with employee tester: ";
        String result = INCORRECT;
        
        employee = new Employee(e);
        try{
            if(employee.getName().equals(e.getName()) &&
               employee.getAge() == e.getAge() &&
               employee.getNif().equals(e.getNif()) &&
               employee.getSalary() == e.getSalary() &&
               employee.getJob().equals(e.getJob()) &&
               employee.getDepartment().equals(e.getDepartment()) &&
               employee.getIncomePerYear() == e.getIncomePerYear()){
                result = CORRECT;
            }
        } catch (PropertyNotInitializedException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidValueException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(description + result);
    }

    public static void main(String[] args) throws InvalidValueException {
        EmployeeTester et = new EmployeeTester();
        et.constructorWithPersonTester(new Person("12345678Z", "Roger", 20));
        et.constructorFullParametersTester(new Person("12345678Z", "Roger", 20), 
                300d, "oficinista", "Direcció", 30000);
        et.constructorWithEmployeeTester(new Employee(new Person("12345678Z", 
                "Roger", 20),300d, "oficinista", "Direcció", 30000));
    }

}
