package ch7_1;

public class PracticeChild extends PracticeParant {

	String lastName;
	
	PracticeChild(String name, int age, String lastName) {
		super(name, age);
		this.lastName = lastName;
		System.out.println(name+" 자식 메소드");
	}

	public static void main(String[] args) {
		
		
		PracticeChild pc = new PracticeChild("지은",6,"Park");
		System.out.println(pc.name);
		System.out.println(pc.age);
		System.out.println(pc.lastName);
	}
}

 	

class PracticeParant{
	
	String name;
	int age;
	
	PracticeParant(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println(name+" 부모 메소드");
	}
}