package main;

import clases.Client;
import clases.Person;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("Rodrigo");
		p1.setLastname("Ayala");
		p1.setAge(30);
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.setName("Maria Jose");
		p2.setLastname("Gonzalez");
		p2.setAge(28);
		System.out.println(p2);
		
		Person p3 = new Person("Alberto", "Ayala", 'm', 40, 3000.00);
		System.out.println(p3);
		
		Client c1 = new Client("Maria", true);
		System.out.println(c1);
		
	}

}
