package ch6;

public class Car_304Example {

	public static void main(String[] args) {
		
		Car_304 car = new Car_304();
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
		
		
		// �߸��� �ӵ�����
		car.setSpeed(-50);
		System.out.println("���� �ӵ� : "+car.getSpeed());

		// �ùٸ� �ӵ�����
		car.setSpeed(60);
		 
		// ����
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("���� �ӵ� : "+car.getSpeed());
	}

}
