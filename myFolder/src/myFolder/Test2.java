package myFolder;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� ��Ģ���� ���α׷��� �ʿ��� �����ڸ� �Է��Ͻÿ�.");
		System.out.println("+, - * / �� �Է� : ");

		String btn = sc.nextLine();
		
		int x;
		int y;
		
		switch (btn) {
		case "+":
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			x = sc.nextInt();
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			y = sc.nextInt();
			System.out.println(x+" + "+y+" = "+(x+y));
			
			System.out.println("���α׷� ����");
			break;
			
		case "-":
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			x = sc.nextInt();
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			y = sc.nextInt();
			System.out.println(x+" - "+y+" = "+(x-y));

			System.out.println("���α׷� ����");
			break;
			
		case "*":
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			x = sc.nextInt();
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			y = sc.nextInt();
			System.out.println(x+" * "+y+" = "+(x*y));
			
			System.out.println("���α׷� ����");
			break;
			
		case "/":
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			x = sc.nextInt();
			System.out.println("������ ������ �Է��Ͻÿ� >> ");
			y = sc.nextInt();
			System.out.println(x+" / "+y+" = "+(x/y));
			
			System.out.println("���α׷� ����");
			break;

		default: System.out.println("���α׷� ����");
			break;
		}
	}

}
