package myFolder;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


//		String season = "spring";
//		
//		switch ("fall") {
//		case "spring" : System.out.println("따뜻하다");
//		break;
//		case "summer" : System.out.println("덥다");
//		break;
//		case "fall" : System.out.println("쌀쌀하다");
//		break;
//		
//		default : System.out.println("값을 확인하세요.");
		
		// 90~100 A등급, 80~89 B등급 ... switch, case 문으로 만들기
		//switch 
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		switch (score / 10) {
		case 10 : System.out.println("A등급");
		// break; 10 과 9는 같은 값을 출력하기때문에 break 굳이 안걸어도 됨.
		case 9 : System.out.println("A등급");
		break;
		case 8 : System.out.println("B등급");
		break;
		case 7 : System.out.println("C등급");
		break;
		case 6 : System.out.println("D등급");
		break;
		
		default : System.out.println("F등급");
		
		
		}

	}

}
