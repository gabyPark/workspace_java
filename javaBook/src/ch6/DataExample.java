package ch6;

public class DataExample {

	public static void main(String[] args) {

		Data data = new Data();
		System.out.println("초기 값 : "+data.num);
		
		data.updateTest1(data.num);
		System.out.println("updateTest1 후 : "+data.num);
		
		data.updateTest2(data);		
		System.out.println("updateTest2 후 : "+data.num);

	}

}
