package ch8;

public class Test {

	public static void main(String[] args) {

		InterA a ; // �������̽��� ���� ������ Ÿ������ ���� ����
//		a = new interA();   ��ü ������ �Ұ�
		
		a = new A();  // �ؿ� InterA�� implements �ϰ� �޼ҵ� ���������ְ�
		// ��ĳ����, �������̽� Ÿ������ �ڵ���ȯ�Ͽ� ���

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