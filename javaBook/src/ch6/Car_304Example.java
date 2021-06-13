package ch6;

public class Car_304Example {

	public static void main(String[] args) {
		
		Car_304 car = new Car_304();
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
		
		
		// 잘못된 속도변경
		car.setSpeed(-50);
		System.out.println("현재 속도 : "+car.getSpeed());

		// 올바른 속도변경
		car.setSpeed(60);
		 
		// 멈춤
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("현재 속도 : "+car.getSpeed());
	}

}
