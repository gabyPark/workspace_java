package ch8;

public class Car {

	 // roll이 재정의된 클래스들이 서브클래스 
	Tire frontLeft = new Hankook();
	Tire frontRight = new Hankook();
	Tire backLeft = new Hankook();
	Tire backRight = new Hankook();
	
	// Tire 인터페이스의 추상메소드 roll() 재정의
	void run() {
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
		
	}
	
}
