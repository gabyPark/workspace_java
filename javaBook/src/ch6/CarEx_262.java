package ch6;

public class CarEx_262 {

	public static void main(String[] args) {

		Car_262 car = new Car_262();
		
		car.turnOn();
		
		car.run();
		
		int speed = car.getSpeed();
		System.out.println("현재 속도 : "+speed);
				
	}

}
