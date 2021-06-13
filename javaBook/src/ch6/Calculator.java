package ch6;

public class Calculator {
	

	// p.276
	
	static double pi = 3.14159;
	
	static int plus1(int x,int y) {
		return x+y;
	}
	
	static int minus1(int x,int y) {
		return x-y;
	}
	
	

	//p.265
	
	double areaRec(double width) {
		return width*width;
	}
	
	double areaRec(double width, double height) {
		return width * height;
	}
	
	
	
	
	///
	
	
	void powerOn() {
		System.out.println("전원 ON");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원 OFF");
	}
	
}
