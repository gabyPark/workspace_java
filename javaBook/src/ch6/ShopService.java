package ch6;

public class ShopService {
	
	// ���� ��ü ����
	private static ShopService shop = new ShopService();
	
	// private ������ ������ֱ� (�ܺο��� ���� ���ϵ���)
	private ShopService(){}
	
	// �� ��ü �������ֱ�
	static ShopService getInstance() {
		return shop;
	}
}
