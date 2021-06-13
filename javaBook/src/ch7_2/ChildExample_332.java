package ch7_2;

public class ChildExample_332 {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1 = c1;   // (1) 자동형변환 : child 메모리를 다 포함한 상태
		
		c1 = (Child)p1; // (1-1) 명시적 형변환 : 오류 없음
		// (3-1) 기본적으로 
		// (자동형변환이 일어난 부모타입)
		
		Parent p2 = new Parent(); // (3) Parent 메모리만 갖고있음
		child = (Child) p2;  // (2) 명시적 형변환 X : 오류 
	}

}

class Parent1 {
	public String nation;
	
	public Parent1() {
		this("대한민국"); //Parent(String nation)
		System.out.println("Parent() call"); //2
	}
	
	Parent1(String nation){
		this.nation =nation;
		System.out.println("Parent(String nation) call"); //1
	}
}


class Child1 extends Parent1{
	private String name;
	
	Child1(){	
		//super(); Parent()
		this("홍길동"); 
		System.out.println("Child() call"); //4
	}
	
	Child1(String name){
		
		this.name = name;
		System.out.println("Child(String name) call"); //3
	}
	
}
