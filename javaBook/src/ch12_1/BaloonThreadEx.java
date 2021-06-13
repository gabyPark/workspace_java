package ch12_1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BaloonThreadEx extends JFrame{
	JPanel p;
	
	BaloonThreadEx(){
		setTitle("Baloon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(null);
		p.addMouseListener(new MouseAdapter(){

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("kk");
				BaloonThread t=	new BaloonThread(e.getX(), e.getY());	
				t.start();
			}
			
			
		});
		setContentPane(p);		
		
		setSize(500,500);
		setVisible(true);
	}
	
	class BaloonThread extends Thread {
		int x,y;
		BaloonThread(int x, int y){
			this.x=x;
			this.y=y;
		}

		@Override
		public void run() {
			System.out.println(x+"  "+y);
			ImageIcon icon = new ImageIcon("images/balloon.jpg");
			JLabel baloon = new JLabel(icon);
			baloon.setSize(60,60);
			baloon.setLocation(x, y);
			p.add(baloon);
                        //p.add(baloon, 0);//새로 만들어진 풍선이 항상 위로 올라온다.
			//cnt =p.getComponentCount();			
			//System.out.println("cont : "+cnt);
			while(y>0){
				y-=20;
				System.out.println("  "+y);
				try{
					Thread.sleep(200);
				}catch(Exception e){
					e.toString();
				}
				baloon.setLocation(x, y);
				//p.repaint();
			}
			
			p.remove(baloon);
		}
		
		
	}

	public static void main(String[] args) {
		new BaloonThreadEx();

	}

}
