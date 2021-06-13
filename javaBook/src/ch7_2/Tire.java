package ch7_2;

public class Tire {

	// 필드
	public int max;
	public int accu;
	public String loca;
	
	
	// 생성자
	public Tire(String loca, int max) {
		this.loca = loca;
		this.max = max;
		
	}
	
	// 메소드
	
	public boolean roll() {
		++accu;
		if(accu < max) {
			System.out.println(loca + "타이어 수명 : "+
					(max - accu) + "회");
			return true;
		} else {
			System.out.println("***"+loca+"타이어 펑크 ***");
			return false;
		}
	}
}
