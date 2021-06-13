package ch7_2;

public class Car {
	
	// 필드
	Tire frontleft = new Tire("앞왼쪽",6);
	Tire frontright = new Tire("앞오른쪽",2);
	Tire backleft = new Tire("뒤왼쪽",3);
	Tire backright = new Tire("뒤오른쪽",4);

	
	// 생성자(자동생성)
	
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다]");
		if (frontleft.roll() == false) {stop(); return 1;}
		if (frontright.roll() == false) {stop(); return 2;}
		if (backleft.roll() == false) {stop(); return 3;}
		if (backright.roll() == false) {stop(); return 4;}
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
