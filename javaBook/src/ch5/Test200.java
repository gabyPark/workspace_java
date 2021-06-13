package ch5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test200 {

	public static void main(String[] args) {
		
		
		// 5-2, 4번
//		int max = 0;
//		int [] arr = {1,5,3,8,2};
//		
//		for (int i=0; i<arr.length;i++) { 
//			if(arr[i]>max ) {
//				max = arr[i];
//				}
//			
//			// 향상된 for문을 사용하여 배열 내부 구성요소 확인
//			Arrays.sort(arr);
//			for (int data : arr) {
//				System.out.println(data);
//			}
//			
//			System.out.println(Arrays.toString(arr));
//			System.out.println("max : "+arr[arr.length-1]);
//			
//			
//			
//			System.out.println("max : "+max);
//			}
		
		
		// 6번 문제
		
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 학생 수  | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.print("선택>");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생 수 : ");
				studentNum = sc.nextInt();
			
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				
				for(int i=0; i<scores.length; i++) {
					System.out.print("score ["+i+"] : ");
					scores[i] = sc.nextInt();
				}
				
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("score ["+i+"] : "+scores[i]);
				}
				
			}else if(selectNo == 4) {
//				int max = 0;
//				int sum=0;
//				for (int data : scores) {
//					if (data > max) {
//						max = data;
//						sum+=data;
//					}
//				}
//				System.out.println("최고 점수 : "+max);
//				System.out.println("평균 점수 : "+sum/(double)scores.length);

			
			// 이런 라이브러리도 있다고 그냥 알아둘것
			int max = Arrays.stream(scores).max().getAsInt();
			System.out.println("최고 점수 : "+max);
			
			System.out.println("평균 점수 :"+Arrays.stream(scores).average().getAsDouble());
			
			}else if(selectNo == 5) {
				run = false;
			} 
			
		}
		
		System.out.println("프로그램 종료");
		
		} 
			
}


