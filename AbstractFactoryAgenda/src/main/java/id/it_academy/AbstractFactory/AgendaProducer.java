package id.it_academy.AbstractFactory;

public class AgendaProducer {
	
	private Telephone tel;
	private Address address;
	
	public AgendaProducer(AgendaFactory aFactory) {
		tel = aFactory.createTelephone();
		address = aFactory.createAddress();
	}
	
	public void print() {
		tel.print();
		address.print();
	}

}
