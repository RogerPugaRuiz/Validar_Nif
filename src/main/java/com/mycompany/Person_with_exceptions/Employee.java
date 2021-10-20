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
public class Employee extends Person{
    private double salary;
    private String job;
    private String department;
    private int incomePerYear;
    
    public Employee(){}
    
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
    
    public Employee(Person p, double salary, String job, String department,int incomePerYear){
        this(p);
        this.setSalary(salary);
        this.setJob(job);
        this.setDepartment(department);
        this.setIncomePerYear(incomePerYear);
    }
    
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
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidValueException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    // Setters and Getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public void setDepartment(String department) {
        this.department = department;
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
