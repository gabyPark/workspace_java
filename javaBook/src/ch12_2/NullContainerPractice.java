package ch12_2;

import java.awt.*;
import javax.swing.*;

public class NullContainerPractice extends JFrame{
	
	NullContainerPractice(){
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
			
		
		for(int i=1; i<=20; i++) {
			JLabel b = new JLabel();  // ��ư ����

			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50; 
			
			b.setLocation(x, y);   
			b.setSize(10, 10);   
			b.setOpaque(true);
			
			
			int r = (int) (Math.random()*255);
			int g = (int) (Math.random()*255);
			int bb = (int) (Math.random()*255);
			Color color = new Color(r, g, bb);
			
			
			b.setBackground(color);
			
			c.add(b);  // ��ư�� ����Ʈ�ҿ� ����
		}	

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerPractice();
	}
}
