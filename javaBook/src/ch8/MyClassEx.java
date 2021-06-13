package ch8;

public class MyClassEx {

	public static void main(String[] args) {

		System.out.println("----------------");

		MyClass myc1 = new MyClass();
		myc1.rc.turnOn();
		myc1.rc.setVolume(5);
		
		
		System.out.println("----------------");
		MyClass myc2 = new MyClass(new Audio());
		
		
		System.out.println("----------------");
		MyClass myc3 = new MyClass();
		myc3.methodA();
		
		
		System.out.println("----------------");
		MyClass myc4 = new MyClass();
		myc4.methodB(new TV());
	
	
	}

}
