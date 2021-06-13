package ch3;

import java.util.Scanner;

public class Test3_2_8 {

	public static void main(String[] args) {

//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
		
		// double을 쓴 이상 그냥 2를 나누는게 아니라 2.0으로 해주는게 좋다
		
//		double area = ((lengthTop + lengthBottom)*height/2.0);
//		System.out.println(area);
		
		
		// 3-2, 11번 문제
		// Scanner 라이브러리 next(), nextInt(), nextLine()
		// Integer 라이브러리 wrapper class  parseInt -> 문자를 정수로 바꿔주는 것
		// String 라이브러리 equals() -> 두개의 문자를 비교해서 같으면 true, 다르면 false
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID : ");
		String name = sc.nextLine();
		
		System.out.println("PW : ");
		String strPw = sc.nextLine();
		int password = Integer.parseInt(strPw);
		
//		System.out.println(name + " "+password);
		
		if(name.equals("java")){
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("틀린 패스워드입니다");
			}
		} else {
			System.out.println("비회원입니다");
		}
		
		
		

	}

}
