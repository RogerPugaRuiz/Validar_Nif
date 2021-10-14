package com.mycompany.Person_with_exceptions;

import com.mycompany.Person_with_exceptions.Exceptions.InvalidValueException;
import com.mycompany.Person_with_exceptions.Exceptions.PropertyNotInitializedException;

/** PersonMain.java
 * Test for Person class with exceptions
 * @author Jose Moreno
 */

public class PersonMain {
	
	public static void main (String args[]) {
		try {
			Person a = new Person("12345678Z", "Peter", 20);
			Person b = new Person();                      
			System.out.println("Person a: "+a.toString());
			System.out.println("Person b: "+b.toString());
			//Attempt to read name
			System.out.println("Name of a: "+a.getName());
			//System.out.println("Name of b: "+b.getName());
			//Attempt to read nif
			System.out.println("NIF of a: "+a.getNif());
			//System.out.println("NIF of b: "+b.getNif());
			//Attempt to write age
			a.setAge(21);
			System.out.println("Age of a: "+a.getAge());
			//b.setAge(-2);
			System.out.println("Age of b: "+b.getAge());
			//Attempt to create new Person
			Person c = new Person("2345671A", "John", -5);
			System.out.println("Person c: "+c.toString());                       
		} catch (InvalidValueException ive) {
			System.out.println(ive.getMessage());			
		} catch (PropertyNotInitializedException pnie) {
			System.out.println(pnie.getMessage());			
		}
	}
}

