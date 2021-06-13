package ch09;

public class NestedClassEx {

	public static void main(String[] args) {

		Car mycar = new Car();
		
		// 객체 생성 하기
		
		// Tire 인스턴스 클래스
		Car.Tire tire = mycar.new Tire();
				
				
		// Engine 정적 클래스
		Car.Engine engine = new Car.Engine();

	}

}
