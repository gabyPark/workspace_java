package myFolder;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


//		String season = "spring";
//		
//		switch ("fall") {
//		case "spring" : System.out.println("�����ϴ�");
//		break;
//		case "summer" : System.out.println("����");
//		break;
//		case "fall" : System.out.println("�ҽ��ϴ�");
//		break;
//		
//		default : System.out.println("���� Ȯ���ϼ���.");
		
		// 90~100 A���, 80~89 B��� ... switch, case ������ �����
		//switch 
		System.out.println("������ �Է��ϼ���.");
		int score = sc.nextInt();
		
		switch (score / 10) {
		case 10 : System.out.println("A���");
		// break; 10 �� 9�� ���� ���� ����ϱ⶧���� break ���� �Ȱɾ ��.
		case 9 : System.out.println("A���");
		break;
		case 8 : System.out.println("B���");
		break;
		case 7 : System.out.println("C���");
		break;
		case 6 : System.out.println("D���");
		break;
		
		default : System.out.println("F���");
		
		
		}

	}

}
