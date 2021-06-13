package ch11_1;

public class SmartPhoneEx {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone("구글", "안드로이드");
		
		String str = phone.toString();
		System.out.println(str);
		
		System.out.println(phone);

	}

}
