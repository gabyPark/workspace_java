package ch11_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		String now1 = now.toString();
		System.out.println(now1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		String now2 = sdf.format(now);
		System.out.println(now2); 
	}

}
