package myFolder;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int even = sc.nextInt();		
		
		if (even % 2 == 0) {System.out.println("짝수입니다");}
		else {System.out.println("홀수입니다."); }
		
		
		// 5의 배수인지 아닌지
		System.out.println("숫자를 입력하세요.");
		int num5 = sc.nextInt();
		
		if (num5 % 5 == 0) {System.out.println("5의 배수입니다.");}
		else  {System.out.println("5의 배수가 아닙니다.");}
		
		}
		
	}
	
