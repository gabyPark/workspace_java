package ch8;

public class MyClass {

	RemoteControl rc = new TV();
	
	
	MyClass(){}
	
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(3);
	}
	
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(8);
	}
}
