package ch2; 

import java.util.Scanner;

public class test2_4_2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("첫번째 수 : ");
	String strNum1 = sc.nextLine();
	
	System.out.println("두번째 수 : ");
	String strNum2 = sc.nextLine();
	
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);

	int result = num1 + num2;
	System.out.println("덧셈 결과 : "+result);
	
//	System.out.println("이름을 입력하세요");
//	String name = sc.nextLine();
//	
//	System.out.println("주민번호 앞 6자리를 입력하세요");
//	System.out.println("전화번호를 입력하세요");
	
	}

}
