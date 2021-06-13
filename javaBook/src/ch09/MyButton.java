package ch09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton  extends JFrame{
	public MyButton() {
		JButton btn = new JButton("버튼이다.");
		
		btn.addActionListener(new MyActionListener() );
		
		
		setLayout(new FlowLayout());
		add(btn);
		setTitle("....");
		setSize(500,500);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 클릭했다.");			
		}
		
		
	}

}
