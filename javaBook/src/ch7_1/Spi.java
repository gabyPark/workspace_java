package ch7_1;

public class Spi extends Per {


//	Spi(){
//		System.out.println(this.name+" "+super.name);
//	}

	void method1 () {  // �θ��� �޼��带 �������ߴٰ� ����.
		System.out.println("Spiderman�� �޼ҵ�");
	}
	
	public static void main(String[] args) {
		Spi s = new Spi();
		s.method1();
	}

}


class Per {
	
	String name = "Peter Parker";
	
	void method1 () {
		System.out.println("Person�� �޼ҵ�");
	}
}
