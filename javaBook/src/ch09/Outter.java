package ch09;

public class Outter {

	
	// �Ű������� ���ú�����,
	// ���� �̳�Ŭ�������� ����� �� final Ư���� ������.
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; �ڵ����� final ó����
		// localVariable = 100; �ڵ����� final ó����
		class Inner{
			public void method() {
				int result = arg + localVariable;
				// �Ϲ� ������ ��� �Ұ�X
				// ���������� ���ó�� ���Ǵ� ������ �� ���� ������ ��� ����
			}
		}
	}
}
