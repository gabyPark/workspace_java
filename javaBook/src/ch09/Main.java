package ch09;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		
		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 1;
		b.method1();
		
		// ���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 2;
		c.field2 = 2;
		c.method1();
		c.method2();
		
		
		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}

}
