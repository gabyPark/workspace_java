package ch7_1;

public class SupersonicEx {

	public static void main(String[] args) {

		Supersonic sa = new Supersonic();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = sa.SUPERSONIC;
		// sa.SUPERSONIC ���� �ص� ������,
		// Supersonic.SUPERSONIC; �� �� ���� �ڵ�.
		// �ʵ带 �����Ѵٴ� ���� �˷��ֱ� ���� ????? ���� ��
		
		sa.fly();
		sa.flymode = sa.NORMAL;
		sa.fly();
		sa.land();
	

	}

}
