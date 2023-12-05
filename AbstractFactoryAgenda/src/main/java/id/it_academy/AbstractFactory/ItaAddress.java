package id.it_academy.AbstractFactory;

public class ItaAddress implements Address{


	private String city;
	private String street;
	private int num;
	private String floor;
	private String door;
	private final String COUNTRY = "italia";


	public ItaAddress(String city, String street, int num, String floor, String door) {

		this.city = city;
		this.street = street;
		this.num = num;
		this.floor = floor;
		this.door = door;
	}



	@Override
	public void print() {
		System.out.println("Address [city=" + city + ", street=" + street + ", num=" + num + ", floor=" + floor + ", door="
				+ door + ", COUNTRY=" + COUNTRY + "]");
	}

}
