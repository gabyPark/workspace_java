package ch12_2;

public class DeamonEx2 implements Runnable {

	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new DeamonEx2()); // Thread(Runnable t)
		t.setDaemon(true);
		t.start();

		for (int i = 1; i < 11; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			System.out.println(i);

			if (i == 5) {
				autoSave = true;
			}

		}
		System.out.println("프로그램 종료");

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {}
			if (true) {
				autoSave();
			}
		}
	}
	

	public void autoSave() {
		System.out.println("자동저장 완료");
	}

}
