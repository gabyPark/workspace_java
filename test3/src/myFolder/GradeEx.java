package myFolder;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		// �Է°� ���� : 70
		// ��°� : C���	(90~100 A���, 80~89 B���, 70~79 C���, 60~69 D���, 0~59 F���)
		// ��ĳ�ʸ� �̿��ϼ���. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int score = sc.nextInt();
		
		if (score > 100) {System.out.println("�߸��� ���Դϴ�.");}
		else if (score >= 90) {System.out.println("A����Դϴ�");}
		else if (score >= 80) {System.out.println("B����Դϴ�");}
		else if (score >= 70) {System.out.println("C����Դϴ�");}
		else if (score >= 60) {System.out.println("D����Դϴ�");}
		else if (score > 0) {System.out.println("F����Դϴ�");}
		else {System.out.println("�߸��� ���Դϴ�.");}

	}

}
