package GUI;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MyFrame extends JFrame {
	MyFrame() {
		getContentPane().setBackground(Color.PINK);
		setTitle("ContentPane과 JFrame"); // 프레임의 타이틀 달기
		setSize(300, 150);
		
		JButton btn1 = new JButton("@@@Hello@@@");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(70)
					.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
					.addGap(25))
		);
		getContentPane().setLayout(groupLayout);
		setVisible(true); // 프레임을 화면에 출력
	}

	public static void main(String[] args) {
		MyFrame fr = new MyFrame();
	}
}
