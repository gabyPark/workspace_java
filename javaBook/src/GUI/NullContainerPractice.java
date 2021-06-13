package GUI;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class NullContainerPractice extends JFrame{
	
	NullContainerPractice(){
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); // 컨텐트팬의 배치관리자 제거
		
			
		int x = (int) Math.random();
		int y = (int) Math.random(); 
		
		JLabel b = new JLabel();  // 버튼 생성
		b.setLocation(x, y);   
		b.setSize(10, 10);   
		b.setOpaque(true);
		b.setBackground(blue);
		
		c.add(b);  // 버튼을 컨텐트팬에 부착
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerPractice();
	}

}
