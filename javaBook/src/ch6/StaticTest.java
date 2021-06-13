package ch6;

public class StaticTest {
	
	static int a = 100;
	
	static int from1to10;
	
	static {
		int sum = 0;
		for(int i=0;i<11;i++) {
			sum+=i;
		} 
		from1to10 = sum;
	}

	public static void main(String[] args){ 
		
	    StaticTest s = new StaticTest();
	    s.a = 200;
	    System.out.println(StaticTest.a+" "+s.a);

	    StaticTest.a = 400;
	    System.out.println(StaticTest.a +" "+s.a);

	    StaticTest s1 = new StaticTest();
	    s1.a = 600;
	    System.out.println(StaticTest.a+" "+s.a+" "+s1.a);
	    
	
	
	    }
}


