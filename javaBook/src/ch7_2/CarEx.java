
package ch7_2;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problem = car.run();
			
			switch (problem) {
			case 1:
				System.out.println("�տ��� Hankook Ÿ�̾�� ��ü");
				car.frontleft = new Hankook("�տ���",15);
				break;
			case 2:
				System.out.println("�տ��� Kumho Ÿ�̾�� ��ü");
				car.frontright = new Kumho("�տ�����",13);
				break;
			case 3:
				System.out.println("�ڿ��� Hankook Ÿ�̾�� ��ü");
				car.backleft = new Hankook("�ڿ���",14);
				break;
			case 4:
				System.out.println("�ڿ����� Kumho Ÿ�̾�� ��ü");
				car.frontleft = new Hankook("�ڿ�����",17);
				break;
			}
			System.out.println("--------------------------");
		}

	}

}
