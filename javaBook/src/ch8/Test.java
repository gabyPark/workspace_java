package ch8;

public class Test {

	public static void main(String[] args) {

		InterA a ; // 인터페이스를 참조 데이터 타입으로 선언 가능
//		a = new interA();   객체 생성은 불가
		
		a = new A();  // 밑에 InterA를 implements 하고 메소드 재정의해주고
		// 업캐스팅, 인터페이스 타입으로 자동변환하여 사용

	}

}


class A implements InterA{
		
		
		@Override
		public void method1(int a) {
			System.out.println("abc");
		}
		
		@Override
		public int method2(){
			return 100;
		}
		
}