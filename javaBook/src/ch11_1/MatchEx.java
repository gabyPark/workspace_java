package ch11_1;

public class MatchEx {

	public static void main(String[] args) {
		
		String name1 = "ȫ�浿123";
		String name2 = "���ڰ���";
		String name3 = "����Jin";
		String name4 = "�ڰ�";
		String name5 = "�ڰ���";
		
		String nameRule = "��-�R��-�R��-�R";
		System.out.println(name1.matches(nameRule));
		System.out.println(name2.matches(nameRule));
		System.out.println(name3.matches(nameRule));
		System.out.println(name4.matches(nameRule));
		System.out.println(name5.matches(nameRule));

		
		// ���ڿ� ��ΰ� ��~�R �ȿ� ����, 3~5 �����ΰ�?
		String nameRule2 = "[��-�R]{3,5}";
		System.out.println(name1.matches(nameRule));
		System.out.println(name2.matches(nameRule));
		System.out.println(name3.matches(nameRule));
		System.out.println(name4.matches(nameRule));
		System.out.println(name5.matches(nameRule));
				

	}

}
