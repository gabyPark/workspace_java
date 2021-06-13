package ch6;

public class BoardTest {

	public static void main(String[] args) {

		Board board1 = new Board("자바"," 생성자 ","윤미영 ","2020-12-21 ",100);
		Board board2 = new Board("jsp"," 스크립트 ","정규태 ","2020-12-21 ");
		Board board3 = new Board("DB"," 오라클 ","정지윤 ");
		Board board4 = new Board("WEB"," 테이블 ");
		
		System.out.println(board1.title+board1.content+board1.writer+board1.date+board1.hitcount);
		System.out.println(board2.title+board2.content+board2.writer+board2.date+board2.hitcount);
		System.out.println(board3.title+board3.content+board3.writer+board3.date+board3.hitcount);
		System.out.println(board4.title+board4.content+board4.writer+board4.date+board4.hitcount);

	}

}
