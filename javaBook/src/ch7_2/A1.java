package ch7_2;

public class A1 {
	    public String x(){return "A1.x";}
	}

	class B1 extends A1{
		public String x(){return "B1.x";}
	    public String y(){return "y";}
	}
	
	public class PolymorphismDemo1 {
	    public static void main(String[] args) {
	        A1 obj = new B1();
	        System.out.println(obj.x());
	        //obj.y();
	    }
	}

