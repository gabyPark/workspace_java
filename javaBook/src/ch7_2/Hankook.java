package ch7_2;

public class Hankook extends Tire{
	
	// 필드
	
	// 생성자
	public Hankook(String loca, int max) {
		super(loca, max);
	}
	
	
	// 메소드
	@Override
	public boolean roll() {
		++accu;
		if(accu < max) {
			System.out.println(loca + "Hankook 타이어 수명 : "+ (max - accu)+"회");
			return true;
		} else {
			System.out.println("***"+loca+"Hankook 타이어 펑크 ***");
			return false;
		}
	}

}
