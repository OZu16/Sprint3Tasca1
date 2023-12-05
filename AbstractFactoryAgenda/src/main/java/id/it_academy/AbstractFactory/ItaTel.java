package id.it_academy.AbstractFactory;

public class ItaTel implements Telephone{

	private int numTel;
	private int PREFIX = 66;
	
	
	
	public ItaTel(int numTel) {
		
		this.numTel = numTel;
	}



	@Override
	public void print() {
		
		System.out.println("+" + PREFIX + " " + numTel);
	}

}