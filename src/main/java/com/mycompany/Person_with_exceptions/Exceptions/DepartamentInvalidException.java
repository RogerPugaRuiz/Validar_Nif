/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.Person_with_exceptions.Exceptions;

/**
 *
 * @author roger
 */
public class DepartamentInvalidException extends Exception{

    /**
     * Creates a new instance of <code>DepartamentInvalidException</code>
     * without detail message.
     */
    public DepartamentInvalidException() {
    }

    /**
     * Constructs an instance of <code>DepartamentInvalidException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DepartamentInvalidException(String msg) {
        super(msg);
    }
}
