package ch6;

public class Data {
	
	int num = 100;
	
	void updateTest1(int num) {
		num+=100;
	}
	
	void updateTest2(Data d) {
		d.num += 100;
	}

}
