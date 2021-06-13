package ch7_2;

public class ChildExample_332 {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1 = c1;   // (1) �ڵ�����ȯ : child �޸𸮸� �� ������ ����
		
		c1 = (Child)p1; // (1-1) ����� ����ȯ : ���� ����
		// (3-1) �⺻������ 
		// (�ڵ�����ȯ�� �Ͼ �θ�Ÿ��)
		
		Parent p2 = new Parent(); // (3) Parent �޸𸮸� ��������
		child = (Child) p2;  // (2) ����� ����ȯ X : ���� 
	}

}

class Parent1 {
	public String nation;
	
	public Parent1() {
		this("���ѹα�"); //Parent(String nation)
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
		this("ȫ�浿"); 
		System.out.println("Child() call"); //4
	}
	
	Child1(String name){
		
		this.name = name;
		System.out.println("Child(String name) call"); //3
	}
	
}
