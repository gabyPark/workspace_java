package ch14_2;

import java.io.*;

public class PrintStreamEx {

	public static void main(String[] args) throws Exception{

		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ w");
		ps.println("�����Ͱ� ����ϴ� ��ó��");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();

	}

}
