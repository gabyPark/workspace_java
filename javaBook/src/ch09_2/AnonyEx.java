package ch09_2;

public class AnonyEx {

	public static void main(String[] args) {

		Anonymous ano = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		ano.field.wake(); 
		
		// �͸� ��ü ���� ���� ���
		ano.method1();
		
		// �͸� ��ü �Ű��� ���
		ano.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�");
				}
				
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�");
					study();
				}
			} );

	}

}
