package ch10_2;

public class TryCatch {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (Exception e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		}
	

	}

}
