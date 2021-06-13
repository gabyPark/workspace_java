package ch7_1;

public class Computer extends Calculator {

	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() °´Ã¼ ½ÇÇà");
		return Math.PI * r * r;
	}
}
