package ch7_1;

public class SpiderManEXEX extends Person {

	SpiderManEXEX(String name) {
		super(name);
		System.out.println("Spiderman ������");
	}

	public static void main(String[] args) {
		SpiderManEXEX s = new SpiderManEXEX("������ũ");
	}

}

class Person {

	Person(String n) {
		System.out.println(n + "person ������");

	}

}

class Spider {

}
