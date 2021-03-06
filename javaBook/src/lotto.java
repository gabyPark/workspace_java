
public class lotto {
	public static void main(String[] args) {
		int[] ball = new int[16]; // 45개의 정수형 값을 ball을 저장하기 위한 배열 생성

		for (int i = 0; i < ball.length; i++) {// 배열에 1~45를 저장
			ball[i] = i + 1;
		} // 0~15 +1 --> 1~16

		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어 저장할 변수

		// 배열에 저장된 값이 잘섞이도록 충분히 큰 반복횟수 1000 지정
		// 배열의 첫번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.

		for (int i = 0; i < 100; i++) {
			j = (int) (Math.random() * 16); // 0~44에서 임의의 값
			// ball[0]과 ball[j]의 값을 서로 바꾼다
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}

		// 배열 ball의 앞에서부터 5개
		for (int i = 0; i <= 2; i++) {
			System.out.print(ball[i] + " ");
		}
		
		System.out.println(j);

	}

}
