package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {
	public static void main (String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		// Test1
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		

		// Test2
//		byte[] array = {10,20,30};
//		os.write(array);
		
		
		// Test3
		byte[] array = {10,20,30,40,50};
		os.write(array,1,3);
		
		os.flush();
		os.close();
	}
}
