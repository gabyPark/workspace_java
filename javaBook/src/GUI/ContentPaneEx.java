package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class ContentPaneEx extends JFrame {
	ContentPaneEx() {
		setTitle("ContentPane�� JFrame"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// ������ �����츦 ������ ���α׷� ����
		Container contentPane = getContentPane(); // ����Ʈ ���� �˾Ƴ���.
		contentPane.setBackground(Color.ORANGE); // �������� ��� ����
		contentPane.setLayout(new FlowLayout()); // ����Ʈ�ҿ� FlowLayout ��ġ������
		contentPane.add(new JButton("OK")); // OK ��ư �ޱ�
		contentPane.add(new JButton("Cancel")); // Cancel ��ư �ޱ�
		contentPane.add(new JButton("Ignore")); // Ignore ��ư �ޱ�
		setSize(300, 150); // ������ ũ�� 300x150 ����
		setVisible(true); // �������� ȭ�鿡 ���
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}