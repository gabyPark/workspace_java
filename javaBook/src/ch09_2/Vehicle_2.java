package ch09_2;

public class Vehicle_2 {
	
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�");
		}
	};
	
	
	void method1() {
		Vehicle local = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�");
			}
		};
		local.run();
	}
	
	
	void method2(Vehicle v) {
		v.run();
	}

}
