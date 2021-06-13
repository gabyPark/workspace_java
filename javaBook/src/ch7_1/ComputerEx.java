package ch7_1;

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("calculator 원면적 :"+cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("computer 원 면적 : "+com.areaCircle(r));

	}

}
