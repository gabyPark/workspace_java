package myFolder;

public class MyClass1 {

	public static void main(String[] args) {
		
		byte a = 127;
	//	System.out.println(a);
		
		char c = 'a'; // 0061 16진수의 값으로 메모리에 저장
		//System.out.println(c);
		
		
		// 변수 선언
		double d = 1; // 1.0 으로 자동형변환
		double dd = 9/2; 
		System.out.println(dd); // 4.0
		
		double ddd = 9/2.0; // 명시적 형변환, 실수를 나오게 하고 싶으면 뒤에 .0을 붙이기
		System.out.println(ddd); // 4.5
		
		int i = 9/2;
		System.out.println(i); // 4
		
		int y = (int)(9/2.0); 
		// 이 상황에서 괄호를 했을 시 연산자인 y를 9 나누기 2 우선순위로 하고, int 정수형으로 변환해줌.
		System.out.println(y); // 4
		
		int h = (int)(9%2);
		h = (100 > 90)? 100 : 90; // 삼항연산자 중 참 일시, 첫 번째 값을 가짐.
		//System.out.println(h); // 100
		
		// 삼항연산자
		int num1 = 100;
		int num2 = 50;		
		int num3 = 30;
		i = ((num1 < num2)? num1 : num2);
		//System.out.println(i);
		i = ((i < num3)? i : num3);
		System.out.println(i); // 30
		
		// 선생님 문제 풀이
		
		
		
		
		
		int ii = (int)100.0; // 실수 100.0을 int가 실행할 수 있는 32bit만 편집해서 실행 할 수 있도록 만드는 명시적 형변환
		//System.out.println(ii);
		
		int iii = (int)100000000000000000000.0; // 여기선 int가 자기가 나타낼 수 있는 최대의 숫자를 나타냄
		//System.out.println(iii);	
		
		char u = 100;
		iii = 100;
		//System.out.println((char)iii);
		
		char k = 'g';
		char r = 128; // 왜 돼?!??!?
		//System.out.println(r);
		
		boolean q = false;
		boolean w = true;
		
	}

}
