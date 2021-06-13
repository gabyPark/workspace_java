package ch10_2;

public class ExceptionPractice {

public static void main(String[] args) {
	

	int a = 0;
	
	try {
		// exception 이 발생 예상되는 상황을 try 에 넣는다
		int i =  100/a;   
		System.out.println("문장 ");
		
	} catch (ArithmeticException e) {
		System.out.println("예외 발생");
	} finally {
		System.out.println("문장 finally");
		// 예외가 발생할 때, try - finally (캐치문 무시)
		// 예외가 발생하지 않을 때, try - catch - finally
		// finally 는 무조건 실행된다
	}
	
	System.out.println("종료");
//	System.out.println(i);   try 안에서 입력된 지역변수 i 는 try 블럭 안에서만 적용된다
	System.out.println(a);
	
	}
}
