package myFolder;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 사칙연산 프로그램에 필요한 연산자를 입력하시오.");
		System.out.println("+, - * / 중 입력 : ");

		String btn = sc.nextLine();
		
		int x;
		int y;
		
		switch (btn) {
		case "+":
			System.out.println("연산할 정수를 입력하시오 >> ");
			x = sc.nextInt();
			System.out.println("연산할 정수를 입력하시오 >> ");
			y = sc.nextInt();
			System.out.println(x+" + "+y+" = "+(x+y));
			
			System.out.println("프로그램 종료");
			break;
			
		case "-":
			System.out.println("연산할 정수를 입력하시오 >> ");
			x = sc.nextInt();
			System.out.println("연산할 정수를 입력하시오 >> ");
			y = sc.nextInt();
			System.out.println(x+" - "+y+" = "+(x-y));

			System.out.println("프로그램 종료");
			break;
			
		case "*":
			System.out.println("연산할 정수를 입력하시오 >> ");
			x = sc.nextInt();
			System.out.println("연산할 정수를 입력하시오 >> ");
			y = sc.nextInt();
			System.out.println(x+" * "+y+" = "+(x*y));
			
			System.out.println("프로그램 종료");
			break;
			
		case "/":
			System.out.println("연산할 정수를 입력하시오 >> ");
			x = sc.nextInt();
			System.out.println("연산할 정수를 입력하시오 >> ");
			y = sc.nextInt();
			System.out.println(x+" / "+y+" = "+(x/y));
			
			System.out.println("프로그램 종료");
			break;

		default: System.out.println("프로그램 종료");
			break;
		}
	}

}
