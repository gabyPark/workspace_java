package ch09;

public class Button {

	// ��ø �������̽�
	static interface OnClickListener{
		void onClick();
	}
	
	// �������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	// �Ű������� ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	
	// ���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
}
