package ch7_2;

public class Car {
	
	// �ʵ�
	Tire frontleft = new Tire("�տ���",6);
	Tire frontright = new Tire("�տ�����",2);
	Tire backleft = new Tire("�ڿ���",3);
	Tire backright = new Tire("�ڿ�����",4);

	
	// ������(�ڵ�����)
	
	// �޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if (frontleft.roll() == false) {stop(); return 1;}
		if (frontright.roll() == false) {stop(); return 2;}
		if (backleft.roll() == false) {stop(); return 3;}
		if (backright.roll() == false) {stop(); return 4;}
		
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
	}
}
