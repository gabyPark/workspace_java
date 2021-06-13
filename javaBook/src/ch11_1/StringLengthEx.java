package ch11_1;

public class StringLengthEx {

	public static void main(String[] args) {
		
		String ssn = "12341231234123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다");
		} else {
			System.out.println("주민번호 자리수가 틀립니다");
		}

	}

}
