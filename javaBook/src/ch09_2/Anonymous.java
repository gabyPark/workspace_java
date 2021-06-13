package ch09_2;

public class Anonymous {

	// �ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}
	};

	void method1() {

		// ���� ���������� ����
		Person local = new Person() {
			void walk() {
				System.out.println("��å");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�");
				walk();
			}
		};

		// ���� ���� ���
		local.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
