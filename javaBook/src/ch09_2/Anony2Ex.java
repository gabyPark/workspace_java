package ch09_2;

public class Anony2Ex {

	public static void main(String[] args) {

		Anony2 ano = new Anony2();
		
		// �͸� ��ü �ʵ� ���
		ano.field.turnOn();
		
		// �͸� ��ü ���� ���� ���
		ano.method1();
		
		// �͸� ��ü �Ű��� ���
		ano.method2(
			new Remote() {
				@Override
				public void turnOn() {
					System.out.println("����Ʈ Ƽ�� ON");
				}
				
				@Override
				public void turnOff() {
					System.out.println("����Ʈ Ƽ�� OFF");
				}
					
			});

	}

}
