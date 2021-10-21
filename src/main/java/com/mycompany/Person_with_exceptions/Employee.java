/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Person_with_exceptions;

import com.mycompany.Person_with_exceptions.Exceptions.InvalidSalaryException;
import com.mycompany.Person_with_exceptions.Exceptions.InvalidValueException;
import com.mycompany.Person_with_exceptions.Exceptions.PropertyNotInitializedException;
import com.mycompany.Person_with_exceptions.Exceptions.DepartamentInvalidException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roger
 */
public class Employee extends Person{
    private double salary;
    private String job;
    private String department;
    private int incomePerYear;
    private final double SMI = 1125.8;
    private final String[] DEPARTMENTS = {
        "Informatica",
        "Direccio",
        "Comercial"};
    
    /**
     * Empty constructor.
     */
    public Employee(){}
    
    /**
     * Constructor with Person
     * @param p Person
     */
    public Employee(Person p){
        try{
            this.setName(p.getName());
            this.setAge(p.getAge());
            this.setNif(p.getNif());
        } catch (PropertyNotInitializedException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (InvalidValueException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    /**
     * Constructor with Person and other specific parameters
     * @param p Person
     * @param salary double
     * @param job String
     * @param department String
     * @param incomePerYear int
     */
    public Employee(Person p, double salary, String job, String department,int incomePerYear){
        this(p);
        try {
            this.setSalary(salary);
            this.setJob(job);
            this.setDepartment(department);
            this.setIncomePerYear(incomePerYear);
        } catch (InvalidSalaryException ex) {
            System.out.println(ex.getMessage());
        } catch (DepartamentInvalidException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    /**
     * Constructor with other employee.
     * @param e 
     */
    public Employee(Employee e){
        try {
            this.setNif(e.getNif());
            this.setName(e.getName());
            this.setAge(e.getAge());
            this.setSalary(e.getSalary());
            this.setJob(e.getJob());
            this.setDepartment(e.getDepartment());
            this.setIncomePerYear(e.getIncomePerYear());
        } catch (PropertyNotInitializedException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidValueException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidSalaryException ex) {
            System.out.println(ex.getMessage());
        } catch (DepartamentInvalidException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    // Setters and Getters
    public double getSalary() {
        return salary;
    }

    /**
     * Method to insert a salary.
     * Salary is valid if it is greater than 1125,8€.
     * @param salary 
     */
    public void setSalary(double salary)throws InvalidSalaryException{
        if (salary >= SMI){
            this.salary = salary;
        }else{
            throw new InvalidSalaryException("Salay is lower than 1125.8");
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }
    
    /**
     * Method that insert a department type.
     * It only accept if is the information department, direction or commercial
     * @param department department name
     */
    public void setDepartment(String department) throws DepartamentInvalidException{
        for (String department_name : this.DEPARTMENTS){
            if (department_name.equalsIgnoreCase(department)){
                this.department = department;
            }
                
        }
        if(this.department != department){
            throw new DepartamentInvalidException("No es un departamento valido"); 
        }
    }

    public int getIncomePerYear() {
        return incomePerYear;
    }

    public void setIncomePerYear(int incomePerYear) {
        this.incomePerYear = incomePerYear;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + "salary=" + salary + ", job=" + job + ", department=" + department + ", incomePerYear=" + incomePerYear + '}';
    }

    
    
    
}
