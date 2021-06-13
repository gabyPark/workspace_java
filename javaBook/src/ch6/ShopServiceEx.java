package ch6;

public class ShopServiceEx {

	public static void main(String[] args) {

		// 새로운 객체 생성 X, getInstance()로 싱글톤 불러와서 쓰는것!
		ShopService sp1 = ShopService.getInstance();
		ShopService sp2 = ShopService.getInstance();
		
		if(sp1 == sp2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}
