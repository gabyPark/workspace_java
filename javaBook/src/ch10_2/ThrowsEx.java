package ch10_2;

public class ThrowsEx {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (Exception e){
			System.out.println("클래스가 존재하지 않습니다");
		}
	}

	
	
	public static void findClass() throws Exception{
		Class clazz = Class.forName("java.lang.String2");
	}
}
