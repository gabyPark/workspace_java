package ch11_1;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {

		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		
		hashmap.put(new Key(1), "ȫ�浿");
		
		
		String value = hashmap.get(new Key(1));
		System.out.println(value);

	}

}
