package main;

import clases.Client;
import clases.GeometricFigure;
import clases.IAccess;
import clases.Oracle;
import clases.Person;
import clases.Rectangle;
import clases.SQL;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("Rodrigo");
		p1.setLastname("Ayala");
		p1.setAge(30);
		System.out.println(p1);
	
		printDetails(p1);
		
		// Encapsulation
		Person p2 = new Person();
		p2.setName("Maria Jose");
		p2.setLastname("Gonzalez");
		p2.setAge(28);
		System.out.println(p2);
		
		// Prints toString() method
		Person p3 = new Person("Alberto", "Ayala", 'm', 40, 3000.00);
		System.out.println(p3);
		
		// Overriding
		Client c1 = new Client("Maria", true);
		System.out.println(c1.details());
		
		
		// Polymorphism
		Client c2 = new Client("Gabriela", false);
		printDetails(c2);
		
		//Abstract
		GeometricFigure rectangle = new Rectangle("rectangle",4,2);
		rectangle.printFigure();
		System.out.println(rectangle.area());
		
		String word = "EPAM";
		StringBuilder input = new StringBuilder();
		input.append(word);
		input.reverse();
		System.out.println(input);
		
		IAccess data = new SQL();
		data.insert();
		
		IAccess data1 = new Oracle();
		printAccess(data1);
	}
	
	public static void printDetails(Person person) {
		System.out.println(person.details());
	}
	
	// Polymorphism with Interfaces
	public static void printAccess(IAccess data) {
		data.delete();
	}
	
	

}
