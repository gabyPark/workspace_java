package ch13_1;

import java.util.HashSet;
import java.util.Objects;

public class HashSet_3 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");   // 중복이라 저장되지 않음
		set.add(new Person("David", 10));
		set.add(new Person("David", 10)); 

		System.out.println(set);
	}
}

// ⭐ equals() 와 hashCode() 를 오버라이딩 해야 HashSet() 이 바르게 동작.
// 오버라이딩 전에는 "David", 10 이 2번 출력된다.
// alt shift s 를 사용하여 자동으로 메서드 생성하기
class Person{
	String name;
	int age;
	

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
	@Override
	public int hashCode() {
		// int hash(Object... values);  // 가변인자
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person) obj;
		
		// 나 자신(this)의 이름과 나이를 p와 비교
		return this.name.contentEquals(p.name) && this.age==p.age;
	}
}
