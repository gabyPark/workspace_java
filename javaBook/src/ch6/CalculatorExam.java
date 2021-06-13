package ch6;

public class CalculatorExam {

	public static void main(String[] args) {
	
		
		// p.276
		double result111 = 10 * 10 * Calculator.pi;
		int result222 = Calculator.plus1(10,5);
		int result333 = Calculator.minus1(10, 5);
		  
		System.out.println(result111);
		System.out.println(result222);
		System.out.println(result333);
		 
		
		// p.265
		Calculator myC = new Calculator();
		
		double result11 = myC.areaRec(10);
		
		double result22 = myC.areaRec(10, 20);
		
		
		System.out.println("정사각형 넓이 : "+result11);
		System.out.println("직사각형 넓이 : "+result22);
		
		///
		
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int result1 = cal.plus(5,6);
		System.out.println(result1);

		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x,y);
		System.out.println(result2);
		
		cal.powerOff();
	}

}
