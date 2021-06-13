package ch6;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.ssn = "123451-1233214";
		p1.name = "È«»ï¿ø";
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	} 

}
