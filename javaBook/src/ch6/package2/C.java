package ch6.package2;

import ch6.package1.A;

public class C {
	
	
	// p.297
	// import 해주기
	
//	A a1 = new A(true);		// public 접근 가능
//	A a2 = new A(1);		// default 같은 패키지 내에서만 접근 가능
//	A a3 = new A("문자열");	// private 이라 접근 불가 
 
	////////////////////////////////////////
	// p.300
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;	// default 같은 패키지 내에서만 접근 가능
//		a.field3 = 1; 	// private 이라 접근 불가 
			
		a.method1();
//		a.method2();	// default 같은 패키지 내에서만 접근 가능
//		a.method3();	// private 이라 접근 불가 

		}
	}
	

