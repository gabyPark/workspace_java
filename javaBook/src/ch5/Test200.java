package ch5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test200 {

	public static void main(String[] args) {
		
		
		// 5-2, 4��
//		int max = 0;
//		int [] arr = {1,5,3,8,2};
//		
//		for (int i=0; i<arr.length;i++) { 
//			if(arr[i]>max ) {
//				max = arr[i];
//				}
//			
//			// ���� for���� ����Ͽ� �迭 ���� ������� Ȯ��
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
		
		
		// 6�� ����
		
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("1. �л� ��  | 2. ���� �Է� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.print("����>");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л� �� : ");
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
//				System.out.println("�ְ� ���� : "+max);
//				System.out.println("��� ���� : "+sum/(double)scores.length);

			
			// �̷� ���̺귯���� �ִٰ� �׳� �˾ƵѰ�
			int max = Arrays.stream(scores).max().getAsInt();
			System.out.println("�ְ� ���� : "+max);
			
			System.out.println("��� ���� :"+Arrays.stream(scores).average().getAsDouble());
			
			}else if(selectNo == 5) {
				run = false;
			} 
			
		}
		
		System.out.println("���α׷� ����");
		
		} 
			
}


