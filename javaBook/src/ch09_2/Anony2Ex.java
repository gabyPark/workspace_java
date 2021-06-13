package ch09_2;

public class Anony2Ex {

	public static void main(String[] args) {

		Anony2 ano = new Anony2();
		
		// 익명 객체 필드 사용
		ano.field.turnOn();
		
		// 익명 객체 로컬 변수 사용
		ano.method1();
		
		// 익명 객체 매개값 사용
		ano.method2(
			new Remote() {
				@Override
				public void turnOn() {
					System.out.println("스마트 티비 ON");
				}
				
				@Override
				public void turnOff() {
					System.out.println("스마트 티비 OFF");
				}
					
			});

	}

}
