package ch7_2;

public class Child extends Parent {

	@Override
	void drive() {
		System.out.println("�ڽ� drive");
	}
	
	void water () {
		System.out.println("�ڽ� water");
	}

	
	
	public static void main(String[] args) {
	
		Child c = new Child();
		
		Parent p = (Parent)c;
		p.drive();
//		p.water();
		
		
		Child c1 = (Child) p;
		c1.drive();
		c1.water();
		
		if(p instanceof Parent) {
			System.out.println("�¾�");
		} else {System.out.println("�ƴϾ�");}
	}



}

