package Practice;

class Account{
	
	public double value;
	
	public static double vatRate = 0.1;
	
	public Account(double value) {
		this.value = value;
	}
	
	public double getVAT() {
		return value * vatRate;
	}
	
	public double total() {
		return value + getVAT();
	}
}

public class Accounting {

	
	public static void main(String[] args) {
		
		Account ac1 = new Account(10000.0);
		
		ac1.value = 10000.0;
		
		System.out.println("���ް��� : "+ac1.value);
		System.out.println("�ΰ����� : "+ac1.getVAT());
		System.out.println("�հ� : "+ac1.total());
		
		
		Account ac2 = new Account(20000.0);
		ac2.value = 20000.0;
		System.out.println("���ް��� : "+ac2.value);
		System.out.println("�ΰ����� : "+ac2.getVAT());
		System.out.println("�հ� : "+ac2.total());
	}
}