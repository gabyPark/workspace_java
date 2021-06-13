package ch8;


public class TV implements RemoteControl {
	
	// 필드
	private int volume;
	
	
	// 가져온 추상메소드
	public void turnOn() {
		System.out.println("TV 전원 ON");
	}
	
	public void turnOff() {
		System.out.println("TV 전원 OFF");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	

		System.out.println("TV 볼륨 : "+this.volume);
	
	}
}

