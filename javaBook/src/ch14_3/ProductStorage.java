package ch14_3;

import java.util.*;

public class ProductStorage {

	private List<Product> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	private int counter;
	
	
	public void showMenu() {
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.등록 || 2.목록 || 3.종료");
			System.out.println("----------------------");
			
			System.out.println("선택 : ");
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
			
			System.out.println("상품명 : ");
			product.setName(sc.nextLine());
			
			System.out.println("가격 : ");
			product.setPrice(Integer.parseInt(sc.nextLine()));

			System.out.println("재고 : ");
			product.setStock(Integer.parseInt(sc.nextLine()));
			
			list.add(product);
		} catch (Exception e) {
			System.out.println("등록 에러 : "+e.getMessage());
		}
		
	}

	private void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno()+" "+p.getName()+" "+
								p.getPrice()+" "+p.getStock());
		}
	}


}
