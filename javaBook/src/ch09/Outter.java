package ch09;

public class Outter {

	
	// 매개변수와 로컬변수는,
	// 로컬 이너클래스에서 사용할 때 final 특성을 가진다.
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; 자동으로 final 처리됨
		// localVariable = 100; 자동으로 final 처리됨
		class Inner{
			public void method() {
				int result = arg + localVariable;
				// 일반 변수는 사용 불가X
				// 내부적으로 상수처럼 사용되는 수정할 수 없는 변수는 사용 가능
			}
		}
	}
}
