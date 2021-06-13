package ch09_2;

public class WorkerEx {

	public static void main(String[] args) {

		Worker_2 anony = new Worker_2();
		anony.field.start();
		anony.method1();
		
		anony.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("테스트를 합니다");
			}
		}

		);

	}

}
