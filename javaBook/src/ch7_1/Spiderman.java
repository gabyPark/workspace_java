package ch7_1;

public class Spiderman extends Person1 {

	Spiderman(){
		// super(); �����Ǿ�����
		// main Ŭ������ extends ��� �±װ� �ɷ��ֱ� ������,
		// �θ��±װ� ���� ��µ�.
		
		// Person(String name) �Ű������� ���������� ����
		// super(�Ű�����) �������.
//		super("���� ��Ŀ");  
		
		System.out.println("Spiderman ������");
	}
	
	public static void main(String[] args) {
		Spiderman s = new Spiderman();
		System.out.println(s);
	}
}



class Person1 {
	
	Person1(){
		System.out.println("Person ������");
	}
	
}



class Spider1 {}
