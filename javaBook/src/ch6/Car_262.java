package ch6;

public class Car_262 {

	// 필드
	int speed;
	
	// 생성자
	
	// 메소드
	
	int getSpeed() {
		return speed;
	}
	
	void turnOn() {
		System.out.println("전원 ON");
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			speed = i;
			System.out.println("시속 "+speed+"km/h");
		}
	}
}
