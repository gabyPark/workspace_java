package ch09_2;

public class Anony2 {
	
	// 필드 초기값으로 대입
	Remote field = new Remote() {
		@Override
		public void turnOn() {
			System.out.println("Tv 전원 ON");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV 전원 Off");
		}
	};
	
	
	void method1() {
		// 로컬 변수값으로 대입
		Remote local = new Remote() {
			@Override
			public void turnOn() {
				System.out.println("오디오 ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오 OFF");
			}
		};
		
		
		// 로컬 변수 사용
		local.turnOn();
	}

	
	void method2(Remote rc) {
		rc.turnOn();
	}
}
