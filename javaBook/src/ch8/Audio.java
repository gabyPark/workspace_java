package ch8;

public class Audio implements RemoteControl{
	
	// �ʵ�
	private int volume;
	
	
	// ������ �߻�޼ҵ��� ��ü �޼ҵ�
	
	public void turnOn() {
		System.out.println("����� ���� ON");
	}
	
	public void turnOff() {
		System.out.println("����� ���� OFF");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("���� ����� ���� : "+this.volume);
	}
 	

}
