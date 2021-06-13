package myFolder;

import java.util.Scanner;

public class DImensionEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] nums = new int [3];

		int sum = 0;
		int max = 0;
		
		for(int i = 0; i<3; i++) {
			System.out.println("ÀÔ·Â");
			nums[i] = sc.nextInt();
			sum = sum + nums[i];
			
			if (nums[i] > max) {
				System.out.println(max = nums[i]);
			}
		}
		
//		for (int i=0; i<3;i++) {
//			System.out.println("nums["+i+"] = "+ nums[i]); 
//			
//		}
		System.out.println("ÃÖ´ñ°ª ="+max); 
//		
		

	}

}
