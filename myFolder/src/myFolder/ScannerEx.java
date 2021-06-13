package myFolder;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("정수를 입력하고 Enter 키를 누르세요");
		
		//int input1 = sc.nextInt(); // 사용자가 int 값을 입력하게 한다.
		//System.out.println(input1);
		
		//System.out.println("단어를 입력하고 Enter 키를 누르세요");
		//String input2 = sc.nextLine();
		//System.out.println(input2);
		
		// 스캐너로 사용자가 입력한 값인 두 개의 정수(num1, num2)를 가지고 두 개를 더한 값을 구하라.
		// 입력을 받기 전엔, 무엇을 입력해야 할 지 명령어가 나오게 하라.
		
//		System.out.println("정수를 입력하고 Enter 키를 누르세요");
//		int num1 = sc.nextInt();
//		System.out.println("정수를 입력하고 Enter 키를 누르세요");
//		int num2 = sc.nextInt();
//		int i = (num1 + num2);
//		System.out.println(i);
		

		String a = sc.nextLine();
		int age = sc.nextInt();
		System.out.println(10 + a + age);
		
		System.out.println("이름은" + a);
		System.out.println("나이는" + age);
		
	}

}
