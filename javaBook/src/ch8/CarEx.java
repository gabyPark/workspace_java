package ch8;

public class CarEx {

	public static void main(String[] args) {

		Car mycar = new Car();
		mycar.run();
		
		System.out.println("---------");

		
		mycar.frontLeft = new Kumho();
		mycar.run();
		
		

	}

}
