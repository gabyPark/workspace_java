package ch11_1;

public class SplitEx {

	public static void main(String[] args) {
		
		// ������ �������� �ɰ���
		String names = "ȫ�浿 �̼��� ������";
		
		String[] data = names.split(" ");
		
		for(int i=0; i<data.length; i++) {
			System.out.println("data["+i+"] = "+data[i]);
		}

		// �������� �������� �ɰ���
		String names2 = "ȫ�浿/�̼���/������";
		
		String[] data2 = names2.split("/");
		
		for(int i=0; i<data2.length; i++) {
			System.out.println("data2["+i+"] = "+data2[i]);
		}

		
		// ���� �ٸ� ���ڸ� �ɰ���
		String names3 = "ȫ�浿a�̼���b������";
		
		String[] data3 = names3.split("[a-z]");
		
		for(int i=0; i<data3.length; i++) {
			System.out.println("data3["+i+"] = "+data3[i]);
		}

	}

}
