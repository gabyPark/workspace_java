package ch13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Object [] objArr = {"1", new Integer(1), "2", "2", "3", "3"};
		
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);  // HashSet 안에 objArr 의 요소들을 저장한다
		}
		
		System.out.println(set);  // 중복된 2, 3은 출력되지 않음
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());  // 1, 1, 2 3 만 출력
		}
	}
}
