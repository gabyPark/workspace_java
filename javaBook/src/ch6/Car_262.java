package ch6;

public class Car_262 {

	// �ʵ�
	int speed;
	
	// ������
	
	// �޼ҵ�
	
	int getSpeed() {
		return speed;
	}
	
	void turnOn() {
		System.out.println("���� ON");
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			speed = i;
			System.out.println("�ü� "+speed+"km/h");
		}
	}
}
