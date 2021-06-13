package ch7_1;

public class Spiderman extends Person1 {

	Spiderman(){
		// super(); 생략되어있음
		// main 클래스에 extends 상속 태그가 걸려있기 때문에,
		// 부모태그가 먼저 출력됨.
		
		// Person(String name) 매개변수를 설정해줬을 때는
		// super(매개변수) 해줘야함.
//		super("피터 파커");  
		
		System.out.println("Spiderman 생성자");
	}
	
	public static void main(String[] args) {
		Spiderman s = new Spiderman();
		System.out.println(s);
	}
}



class Person1 {
	
	Person1(){
		System.out.println("Person 생성자");
	}
	
}



class Spider1 {}
