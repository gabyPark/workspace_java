package ch6;

public class CarExample {

	public static void main(String[] args) {
		
	
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("���");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���");
		}
		
		////
	

		Car car1 = new Car();
		System.out.println("car1.company : "+car1.company);
		
		Car car2 = new Car("�ڰ���");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);

		Car car3 = new Car("�ڰ���", "����");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);

		Car car4 = new Car("�ý�", "����", 200);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
	
		
		
	}

}
