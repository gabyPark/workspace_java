package ch7_1;

public class Computer extends Calculator {

	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ��ü ����");
		return Math.PI * r * r;
	}
}
