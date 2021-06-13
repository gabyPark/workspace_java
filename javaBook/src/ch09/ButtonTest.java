package ch09;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame{
	public ButtonTest() {
		

		JButton btn = new JButton("버튼이다.");
		btn.addAction
		
		setLayout(new FlowLayout());
		add(btn);
		setTitle("....");
		setSize(500,500);
		setVisible(true);	
	}
	
	class MyActionListener implements ActionListener{
		
	}
}
