/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.Person_with_exceptions.Exceptions;

/**
 *
 * @author roger
 */
public class InvalidSalaryException extends Exception{

    /**
     * Creates a new instance of <code>SalariInvalidException</code> without
     * detail message.
     */
    public InvalidSalaryException() {
    }

    /**
     * Constructs an instance of <code>SalariInvalidException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidSalaryException(String msg) {
        super(msg);
    }
}
