package ch13_1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		
		
		Iterator b = a.iterator();
		while(b.hasNext()) {
			Object obj = b.next();
			System.out.println(obj);
		}
		

	}

}
