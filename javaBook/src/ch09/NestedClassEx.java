package ch09;

public class NestedClassEx {

	public static void main(String[] args) {

		Car mycar = new Car();
		
		// ��ü ���� �ϱ�
		
		// Tire �ν��Ͻ� Ŭ����
		Car.Tire tire = mycar.new Tire();
				
				
		// Engine ���� Ŭ����
		Car.Engine engine = new Car.Engine();

	}

}
