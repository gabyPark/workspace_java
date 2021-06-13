package GUI;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class NullContainerPractice extends JFrame{
	
	NullContainerPractice(){
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		
			
		int x = (int) Math.random();
		int y = (int) Math.random(); 
		
		JLabel b = new JLabel();  // ��ư ����
		b.setLocation(x, y);   
		b.setSize(10, 10);   
		b.setOpaque(true);
		b.setBackground(blue);
		
		c.add(b);  // ��ư�� ����Ʈ�ҿ� ����
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerPractice();
	}

}
