package ch8;

public class Car {

	 // roll�� �����ǵ� Ŭ�������� ����Ŭ���� 
	Tire frontLeft = new Hankook();
	Tire frontRight = new Hankook();
	Tire backLeft = new Hankook();
	Tire backRight = new Hankook();
	
	// Tire �������̽��� �߻�޼ҵ� roll() ������
	void run() {
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
		
	}
	
}
