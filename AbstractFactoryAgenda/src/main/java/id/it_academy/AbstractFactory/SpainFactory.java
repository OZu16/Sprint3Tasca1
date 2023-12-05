package id.it_academy.AbstractFactory;

import java.util.Scanner;

public class SpainFactory implements AgendaFactory{
	
	static Scanner sc = new Scanner(System.in);

	@Override
	public Telephone createTelephone() {
		
		int numTel;
		System.out.println("introdueix el numero de telefon:");
		numTel = sc.nextInt();
		
		return new SpainTel(numTel);
	}

	@Override
	public Address createAddress() {
		
		String city;
		String street;
		int num;
		String floor;
		String door;
		
		
		System.out.println("introdueix adreça:"
				+ "\nciutat:");
		sc.nextLine();
		city = sc.nextLine();
		System.out.println("carrer:");
		street = sc.nextLine();
		System.out.println("numero:");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println("piso:");
		floor = sc.nextLine();
		System.out.println("porta:");
		door = sc.nextLine();
		
		return new SpainAddress(city, street, num, floor, door);
	}

}
