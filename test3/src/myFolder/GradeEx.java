package myFolder;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		// 입력값 점수 : 70
		// 출력값 : C등급	(90~100 A등급, 80~89 B등급, 70~79 C등급, 60~69 D등급, 0~59 F등급)
		// 스캐너를 이용하세요. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		if (score > 100) {System.out.println("잘못된 값입니다.");}
		else if (score >= 90) {System.out.println("A등급입니다");}
		else if (score >= 80) {System.out.println("B등급입니다");}
		else if (score >= 70) {System.out.println("C등급입니다");}
		else if (score >= 60) {System.out.println("D등급입니다");}
		else if (score > 0) {System.out.println("F등급입니다");}
		else {System.out.println("잘못된 값입니다.");}

	}

}
