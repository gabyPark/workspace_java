package ch7_1;

public class SupersonicEx {

	public static void main(String[] args) {

		Supersonic sa = new Supersonic();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = sa.SUPERSONIC;
		// sa.SUPERSONIC 으로 해도 되지만,
		// Supersonic.SUPERSONIC; 이 더 좋은 코드.
		// 필드를 참조한다는 것을 알려주기 위해 ????? 몰라 ㅠ
		
		sa.fly();
		sa.flymode = sa.NORMAL;
		sa.fly();
		sa.land();
	

	}

}
