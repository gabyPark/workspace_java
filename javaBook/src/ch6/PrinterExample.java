package ch6;

public class PrinterExample {

	public static void main(String[] args) {
		
		System.out.println("��ü ���� �� : "+Printer.name);
		System.out.println("��ü ���� �� : "+10);
		
		Printer printer = new Printer();
		
		System.out.println("��ü ���� �� :"+printer.name);
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");

	}

}
