package ch6;

public class ShopServiceEx {

	public static void main(String[] args) {

		// ���ο� ��ü ���� X, getInstance()�� �̱��� �ҷ��ͼ� ���°�!
		ShopService sp1 = ShopService.getInstance();
		ShopService sp2 = ShopService.getInstance();
		
		if(sp1 == sp2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ�");
		}

	}

}
