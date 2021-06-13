package ch09_2;

public class VehicleEx {

	public static void main(String[] args) {

		Vehicle_2 ano = new Vehicle_2();
		
		
		ano.field.run();
		
		ano.method1();
		
		ano.method2(new Vehicle() {
			@Override 
			public void run() {
				System.out.println("트럭이 달립니다");
			}
			
		
	});

	}

}