package ch09_2;

public class Worker_2 {

	Worker field = new Worker() {

		@Override
		public void start() {
			System.out.println("�������� �մϴ�");
		}
	};

	void method1() {
		Worker local = new Worker() {

			@Override
			public void start() {
				System.out.println("������ �մϴ�");
			}

		};
		local.start();
	}

	void method2(Worker worker) {
		worker.start();
	}
}
