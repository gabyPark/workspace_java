package ch12_2;

public class PrintThread2 extends Thread {

	public void run() {
		
		try {
			while(true) {
				System.out.println("������");
				// Thread.sleep(1);
				if(Thread.interrupted()) {
					break;
				}
			}
			
		} catch (Exception e) {
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("��������");
	}
}