package ch6;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println(StaticTest.from1to10);
		

		// 객체 생성
		Patient p = new Patient();
		// p 는 Patient 크기 만큼 할당된 메모리 주소값을 가진다.
		// 객체 생성 p, p1은 인스턴스
		
		p.body = "머리";
		p.name = "김두한";
		p.no = "123";
		
		Patient p1 = new Patient();
		p1.body ="배";
		p.name = "박가빈";
		p.no = "124";		
		
		System.out.println(p.body+p.name+p.no);
	}

}
