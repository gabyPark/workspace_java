package ch3;

public class Test34_140_144 {

	public static void main(String[] args) {

	int num = (int) (Math.random() * 6) +1;
	
	if(num==1) {
		System.out.println("1��");
	} else if (num==2) {
		System.out.println("2��");
	} else if (num==3) {
		System.out.println("3��");
	} else if (num==4) {
		System.out.println("4��");
	} else if (num==5) {
		System.out.println("5��");
	} else  {
		System.out.println("6��");
	}
	
	
	///
	
	switch(num) {
	case 1 :
		System.out.println("1��");
		break;
	case 2 :
		System.out.println("2��");
		break;
	case 3 :
		System.out.println("3��");
		break;
	case 4:
		System.out.println("4��");
		break;
	case 5 :
		System.out.println("5��");
		break;
		
		default :
			System.out.println("6��");
			break;
	}
	
	
	///
	
	int time = (int) (Math.random() * 4) + 8;
	System.out.println("���� �ð� : "+time+"��");
	
	switch (time) {
	case 8:
		System.out.println("����Դϴ�");
		break;
	case 9:
		System.out.println("ȸ�ǽð�");
		break;
	case 10:
		System.out.println("���� ���� �ð�");
		break;
	default:
		System.out.println("�ܱ�");
		break;
	}
	
	
	char grade = 'B';
	
	switch (grade) {
	case 'A':
	case 'a':
		System.out.println("��� ȸ���Դϴ�");
		break;
	case 'B':
	case 'b':
		System.out.println("�Ϲ� ȸ���Դϴ�");
		break;

	default:
		System.out.println("�մ��Դϴ�");
		break;
	}
	
	
	///
	
	
	String position = "����";
	
	switch (position) {
	case "����":
		System.out.println("700����");
		break;
	case "����":
		System.out.println("500����");
		break;
	default:
		System.out.println("300����");
		break;
	}
	
	
	}

}
