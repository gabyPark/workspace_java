
public class lotto {
	public static void main(String[] args) {
		int[] ball = new int[16]; // 45���� ������ ���� ball�� �����ϱ� ���� �迭 ����

		for (int i = 0; i < ball.length; i++) {// �迭�� 1~45�� ����
			ball[i] = i + 1;
		} // 0~15 +1 --> 1~16

		int temp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� ��� ������ ����

		// �迭�� ����� ���� �߼��̵��� ����� ū �ݺ�Ƚ�� 1000 ����
		// �迭�� ù��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.

		for (int i = 0; i < 100; i++) {
			j = (int) (Math.random() * 16); // 0~44���� ������ ��
			// ball[0]�� ball[j]�� ���� ���� �ٲ۴�
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}

		// �迭 ball�� �տ������� 5��
		for (int i = 0; i <= 2; i++) {
			System.out.print(ball[i] + " ");
		}
		
		System.out.println(j);

	}

}