package ch09;

public class CheckBox {

	// ��ø �������̽�
	static interface OnSelectListener {
		void onSelect();
	}

	// ��ø �������̽� �ʵ�
	OnSelectListener listener;

	
	// setter �޼ҵ�� �ܺο��� ������ü�� �޾� �ʵ忡 ����
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	// select �̺�Ʈ �߻� �� �������̽��� ���� ���� ��ü�� �޼ҵ带 ȣ��
	void select() {
		listener.onSelect();
	}

}
