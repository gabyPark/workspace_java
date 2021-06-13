package ch7_2;

public class Kumho extends Tire {
	
	// 필드
	
	// 생성자
	public Kumho(String loca, int max) {
		super(loca, max);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accu;
		if(accu < max) {
			System.out.println(loca+"Kumho 타이어 수명 : "+(max-accu)+"회");
			return true;
		} else {
			System.out.println("***"+loca+"Kumho 타이어 펑크***");
			return false;
		}
	}

}
