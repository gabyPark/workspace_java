package ch11_1;

public class StringIndexOfEx {

	public static void main(String[] args) {

		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹ� ���� å");
		} else {
			System.out.println("�ڹ� �̰��� å");
		}

	}

}