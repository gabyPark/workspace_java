package ch12_1;
import java.awt.Toolkit;

public class guguThreadTeacher {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		
		System.out.println("메인 끝");
	}
}
	
	class DanTread extends Thread{
		int dan = 3;
		
		DanThread (int dan){
			this.dan = dan;
		}
		
		@Override
		public void run() {
			for(int i=1; i<10; i++) {
				System.out.println(dan+" * "+" = "+(dan*i);
				try { Thread.sleep(200); } catch (Exception e) {}
			
		}
	}
}

