
package ch7_2;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problem = car.run();
			
			switch (problem) {
			case 1:
				System.out.println("앞왼쪽 Hankook 타이어로 교체");
				car.frontleft = new Hankook("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른 Kumho 타이어로 교체");
				car.frontright = new Kumho("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook 타이어로 교체");
				car.backleft = new Hankook("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 Kumho 타이어로 교체");
				car.frontleft = new Hankook("뒤오른쪽",17);
				break;
			}
			System.out.println("--------------------------");
		}

	}

}
