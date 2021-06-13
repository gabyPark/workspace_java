package ch8;


public class TV implements RemoteControl {
	
	// �ʵ�
	private int volume;
	
	
	// ������ �߻�޼ҵ�
	public void turnOn() {
		System.out.println("TV ���� ON");
	}
	
	public void turnOff() {
		System.out.println("TV ���� OFF");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	

		System.out.println("TV ���� : "+this.volume);
	
	}
}
