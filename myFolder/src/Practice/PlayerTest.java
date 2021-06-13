package Practice;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}


class AudioPlayer extends Player{
	@Override
	void play(int pos) {
		System.out.println(pos + "��ġ���� play �մϴ�");}
	
	@Override
	void stop() {System.out.println("����� ����ϴ�");}	
}


public class PlayerTest {
	public static void main(String[] args) {

	Player ap = new AudioPlayer();
	ap.play(100);
	ap.stop();	
	}
}
