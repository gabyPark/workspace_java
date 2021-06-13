package Practice;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}


class AudioPlayer extends Player{
	@Override
	void play(int pos) {
		System.out.println(pos + "위치부터 play 합니다");}
	
	@Override
	void stop() {System.out.println("재생을 멈춥니다");}	
}


public class PlayerTest {
	public static void main(String[] args) {

	Player ap = new AudioPlayer();
	ap.play(100);
	ap.stop();	
	}
}
