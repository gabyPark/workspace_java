package ch7_3;

public class HttpEx extends Http {
	public static void main(String[] args) {
				
		method(new LoginServlet());
		method(new FileDown());
	}

	public static void method(Http http) {
		http.service();
	}

	@Override
	public void service() {
		
	}
	
}

