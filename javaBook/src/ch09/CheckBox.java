package ch09;

public class CheckBox {

	// 중첩 인터페이스
	static interface OnSelectListener {
		void onSelect();
	}

	// 중첩 인터페이스 필드
	OnSelectListener listener;

	
	// setter 메소드로 외부에서 구현객체를 받아 필드에 대입
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	// select 이벤트 발생 시 인터페이스를 통해 구현 객체의 메소드를 호출
	void select() {
		listener.onSelect();
	}

}
