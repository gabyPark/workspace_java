package ch10_2;

public class ExceptionPractice {

public static void main(String[] args) {
	

	int a = 0;
	
	try {
		// exception �� �߻� ����Ǵ� ��Ȳ�� try �� �ִ´�
		int i =  100/a;   
		System.out.println("���� ");
		
	} catch (ArithmeticException e) {
		System.out.println("���� �߻�");
	} finally {
		System.out.println("���� finally");
		// ���ܰ� �߻��� ��, try - finally (ĳġ�� ����)
		// ���ܰ� �߻����� ���� ��, try - catch - finally
		// finally �� ������ ����ȴ�
	}
	
	System.out.println("����");
//	System.out.println(i);   try �ȿ��� �Էµ� �������� i �� try �� �ȿ����� ����ȴ�
	System.out.println(a);
	
	}
}
