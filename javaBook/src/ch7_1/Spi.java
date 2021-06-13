package ch7_1;

public class Spi extends Per {


//	Spi(){
//		System.out.println(this.name+" "+super.name);
//	}

	void method1 () {  // 부모의 메서드를 재정의했다고 본다.
		System.out.println("Spiderman의 메소드");
	}
	
	public static void main(String[] args) {
		Spi s = new Spi();
		s.method1();
	}

}


class Per {
	
	String name = "Peter Parker";
	
	void method1 () {
		System.out.println("Person의 메소드");
	}
}
