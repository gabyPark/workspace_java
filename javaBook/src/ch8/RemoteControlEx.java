package ch8;

public class RemoteControlEx {
	public static void main(String[] args) {
		
		RemoteControl rc = new TV();
		rc.turnOn();
		rc.setVolume(7);
		
		
		rc = new Audio();		
		rc.turnOn();
	}

}
