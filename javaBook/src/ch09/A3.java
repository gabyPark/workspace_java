package ch09;

public class A3 {

	
	class B{
		void method() {
		field1 = 10;
		method1();
		
		field2 = 10;
		method2();
		}
	}
	
	static class C{
		void method() {
			// field1 = 10;
			field2 = 10;
			// method1();
			method2();
		}
	}
	
	
	// �ν��Ͻ� �ʵ�/�޼ҵ�
	int field1;
	void method1() {}
	
	// ���� �ʵ�/�޼ҵ�
	static int field2;
	static void method2() {}
	
}
