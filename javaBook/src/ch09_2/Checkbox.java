package ch09_2;

public class Checkbox {
	
	OnselectListener listener;
	
	public void setOnSelectListener(OnselectListener listener) {
		this.listener = listener;
	}


	void select() {
		listener.onSelect();
	}
	
	
	static interface OnselectListener{
		void onSelect();
	}

}
