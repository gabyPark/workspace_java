package ch2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimalTest {

	public static void main(String[] args) {
		
	BigInteger b1 = new BigInteger ("123456789123456789");
	BigInteger b2 = new BigInteger ("123456789123456789");
	System.out.println(b1.add(b2));	
	System.out.println(b1.subtract(b2));	
	System.out.println(b1.multiply(b2));	
	System.out.println(b1.divide(b2));	

	float d1 = 2.0f;
	float d2 = 1.1f;
	System.out.println(d1-d2);
	BigDecimal bd1 = new BigDecimal("2.0");	
	BigDecimal bd2 = new BigDecimal("2.0");	
	System.out.println(bd1.subtract(bd2));
	}

}
