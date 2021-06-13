package ch11_1;

public class SplitEx {

	public static void main(String[] args) {
		
		// 공백을 기준으로 쪼개기
		String names = "홍길동 이순신 유관순";
		
		String[] data = names.split(" ");
		
		for(int i=0; i<data.length; i++) {
			System.out.println("data["+i+"] = "+data[i]);
		}

		// 슬래쉬를 기준으로 쪼개기
		String names2 = "홍길동/이순신/유관순";
		
		String[] data2 = names2.split("/");
		
		for(int i=0; i<data2.length; i++) {
			System.out.println("data2["+i+"] = "+data2[i]);
		}

		
		// 서로 다른 문자를 쪼개기
		String names3 = "홍길동a이순신b유관순";
		
		String[] data3 = names3.split("[a-z]");
		
		for(int i=0; i<data3.length; i++) {
			System.out.println("data3["+i+"] = "+data3[i]);
		}

	}

}
