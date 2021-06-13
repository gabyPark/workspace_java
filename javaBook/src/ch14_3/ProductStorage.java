package ch14_3;

import java.util.*;

public class ProductStorage {

	private List<Product> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	private int counter;
	
	
	public void showMenu() {
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.��� || 2.��� || 3.����");
			System.out.println("----------------------");
			
			System.out.println("���� : ");
			String selectNo = sc.nextLine();
			switch (selectNo) {
			case "1": registerProduct(); break;
			case "2": showProducts(); break;
			case "3": return;

			}
		}
	}

	private void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.println("��ǰ�� : ");
			product.setName(sc.nextLine());
			
			System.out.println("���� : ");
			product.setPrice(Integer.parseInt(sc.nextLine()));

			System.out.println("��� : ");
			product.setStock(Integer.parseInt(sc.nextLine()));
			
			list.add(product);
		} catch (Exception e) {
			System.out.println("��� ���� : "+e.getMessage());
		}
		
	}

	private void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno()+" "+p.getName()+" "+
								p.getPrice()+" "+p.getStock());
		}
	}


}
