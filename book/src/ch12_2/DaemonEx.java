package ch12_2;

public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();
		auto.setDaemon(true);
		auto.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		
		System.out.println("메인 스레드 종료");
	}

}
