package ch12_1;
import java.awt.Toolkit;

public class guguThread {
	public static void main(String[] args) {
		System.out.println("���� ����");
		
		// 3�� ��� ������ ������ �۵�
		Thread t3 =  new Thread() {
			public void run() {
				for(int x=3; x<4; x++) {
					for(int y=1; y<10; y++) {
					System.out.println(x+" * "+y+" = "+(x*y));
					}
				}
			}
		};
		
			
		
		// 4�� ��� ������ ������ �۵�
		Thread t4 =  new Thread() {
			public void run() {
				for(int x=4; x<5; x++) {
					for(int y=1; y<10; y++) {
						System.out.println(x+" * "+y+" = "+(x*y));
					}
				}
			}
		};
		
		
		// 7�� ��� ������ ������ �۵�
		Thread t7 =  new Thread() {
			public void run() {
				for(int x=7; x<8; x++) {
					for(int y=1; y<10; y++) {
						System.out.println(x+" * "+y+" = "+(x*y));
					}
				}
			}
		};
		
	t3.start();
	t4.start();
	t7.start();
		
		System.out.println("���� ��");
	}
	
}
