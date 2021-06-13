package ch11_1;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException{

		byte[] bytes = new byte[10];
		
		System.out.println("ют╥б : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str+" "+readByteNo);
		
		for(int i=0; i<bytes.length;i++) {
			System.out.println(bytes[i]);
		}

	}

}
