package ch6.package2;

import ch6.package1.A;

public class C {
	
	
	// p.297
	// import ���ֱ�
	
//	A a1 = new A(true);		// public ���� ����
//	A a2 = new A(1);		// default ���� ��Ű�� �������� ���� ����
//	A a3 = new A("���ڿ�");	// private �̶� ���� �Ұ� 
 
	////////////////////////////////////////
	// p.300
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;	// default ���� ��Ű�� �������� ���� ����
//		a.field3 = 1; 	// private �̶� ���� �Ұ� 
			
		a.method1();
//		a.method2();	// default ���� ��Ű�� �������� ���� ����
//		a.method3();	// private �̶� ���� �Ұ� 

		}
	}
	

