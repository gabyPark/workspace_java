package ch8;

public class Audio implements RemoteControl{
	
	// 필드
	private int volume;
	
	
	// 가져온 추상메소드의 실체 메소드
	
	public void turnOn() {
		System.out.println("오디오 전원 ON");
	}
	
	public void turnOff() {
		System.out.println("오디오 전원 OFF");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 오디오 볼륨 : "+this.volume);
	}
 	

}
