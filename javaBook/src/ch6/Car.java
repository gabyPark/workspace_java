package ch6;

public class Car {
	
	// �ʵ�
	int gas;	
	
	// ������	
	// �޼ҵ�

	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�. �ܷ� : "+gas);
				gas-=1;
			} else {
				System.out.println("����ϴ�. �ܷ� : "+gas);
				return;
			}
		}
	}
	 
	//

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model, "����", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
