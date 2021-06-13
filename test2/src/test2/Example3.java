package test2;

public class Example3 {

	public static void main(String[] args) {
		
		System.out.println("자바 공부중");
		
		// <자바에서 사용하는 데이터 타입> 
		// 1. 기본 데이터형 : 정수 (int long short byte), 실수 (double float) , 문자 ('A' '가' 'a' 인용부호 하나 + 문자 하나 = char), 논리 (true false를 갖는 boolean)
		// 2. 참조 데이터형 : 문자열 (String "가나다" "가" ""...)
		
		// 변수 선언을 먼저 해줘야 함, 변수 선언은 유일하게 한번만 가능(이름 중복 불가)
		int add;
		add = 1+2; // == 이 같다는 의미, = 는 대입의 의미가 있는 대입연산자
		System.out.println(add);
		add = 4; // 마지막으로 쓰여진 코드를 인식함
		System.out.println(add);
		
		double add2;
		add2 = 1.2;
		System.out.println(add2);
		// int 에서는 x.0 이  불가능하지만, double 0은 0.0으로 인식가능 (자동형변환)
		
		char c = 'a';
		System.out.println(c);
		c = 'b';
		System.out.println(c);
		
		boolean b;
		b = true;
		b = false;
		
		String name = "박가빈";
		System.out.println(name);
		

	}

}
