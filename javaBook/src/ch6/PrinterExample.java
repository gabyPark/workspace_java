package ch6;

public class PrinterExample {

	public static void main(String[] args) {
		
		System.out.println("按眉 积己 傈 : "+Printer.name);
		System.out.println("按眉 积己 傈 : "+10);
		
		Printer printer = new Printer();
		
		System.out.println("按眉 积己 饶 :"+printer.name);
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("全辨悼");

	}

}
