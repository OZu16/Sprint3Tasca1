package id.it_academy.AbstractFactory;

public class SpainTel implements Telephone{
	
	private int numTel;
	private int PREFIX = 34;
	
	
	
	public SpainTel(int numTel) {
		
		this.numTel = numTel;
	}



	@Override
	public void print() {
		
		System.out.println("+" + PREFIX + " " + numTel);
	}

}
