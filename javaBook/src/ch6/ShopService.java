package ch6;

public class ShopService {
	
	// 본인 객체 생성
	private static ShopService shop = new ShopService();
	
	// private 생성자 만들어주기 (외부에서 접근 못하도록)
	private ShopService(){}
	
	// 내 객체 리턴해주기
	static ShopService getInstance() {
		return shop;
	}
}
