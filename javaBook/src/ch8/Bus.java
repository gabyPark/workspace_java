package ch8;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스런");
	}
	
	public void checkFee() {
		System.out.println("승차 요금 체크");
	}
}
