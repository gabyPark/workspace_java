package ch09_2;

public class Anony2 {
	
	// �ʵ� �ʱⰪ���� ����
	Remote field = new Remote() {
		@Override
		public void turnOn() {
			System.out.println("Tv ���� ON");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV ���� Off");
		}
	};
	
	
	void method1() {
		// ���� ���������� ����
		Remote local = new Remote() {
			@Override
			public void turnOn() {
				System.out.println("����� ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("����� OFF");
			}
		};
		
		
		// ���� ���� ���
		local.turnOn();
	}

	
	void method2(Remote rc) {
		rc.turnOn();
	}
}
