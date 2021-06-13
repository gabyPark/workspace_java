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
	
	
	// 인스턴스 필드/메소드
	int field1;
	void method1() {}
	
	// 정적 필드/메소드
	static int field2;
	static void method2() {}
	
}
