import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginSample extends JFrame{
	/*
	 * field tfID : user text ID compare with Manager Table ID
	 * field tfPWD : user text PWD  compare with Manager Table PWD
	 */
	private JTextField tfID;   
	private JPasswordField tfPWD;
	
	private JLabel resultLbl;
	private static Connection con;
	
	
	/* 
	 * constructor - GUI 
	 */
	LoginSample(){		
		
		setTitle(" Login System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		
		setSize(500,500);
		
		JPanel nPanel = new JPanel();		//North Pannel
		getContentPane().add(nPanel, BorderLayout.NORTH);
		
		JLabel exLbl = new JLabel("input ID,  input password ...");		
		exLbl.setHorizontalAlignment(SwingConstants.LEFT);
		exLbl.setFont(new Font("굴림", Font.PLAIN, 16));
		nPanel.add(exLbl);	

		
		JPanel cPanel = new JPanel();  //Center Pannel
		getContentPane().add(cPanel, BorderLayout.CENTER);
		
		JLabel lblID = new JLabel("ID");
		cPanel.add(lblID);
		
		tfID = new JTextField();
		cPanel.add(tfID);
		tfID.setColumns(10);
		
		JLabel pwLbl = new JLabel("PWD");
		cPanel.add(pwLbl);
		
		tfPWD = new JPasswordField();
		cPanel.add(tfPWD);
		tfPWD.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		
		//Button click
		btnLogin.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				String userId = tfID.getText();
				String userPwd = tfPWD.getText();
				if(resultLogin(userId, userPwd)) resultLbl.setText("환영합니다. 로그인 되었습니다 !!!! " ); 
				else resultLbl.setText("collect ID , PWD  !!!! " );
				
			}
		});
		
		btnLogin.setFont(new Font("굴림", Font.PLAIN, 10));
		cPanel.add(btnLogin);
		
		JPanel sPanel = new JPanel(); // South Pannel 
		getContentPane().add(sPanel, BorderLayout.SOUTH);
		
		
		//confirm Login result
		resultLbl = new JLabel("Sample Login System");
		sPanel.add(resultLbl);
		


		setVisible(true);
		
	}
	
	
	

	/*
	 * execute program
	 */
	public static void main(String[] args) {
		
		connectDB();
		new LoginSample();

	}
	
	
	/*
	 * connect MySQL javaDB (MANAGER table)
	 */
	
	static void connectDB(){
	    String DRIVER="com.mysql.jdbc.Driver";
	    String DBURL="jdbc:mysql://192.168.5.200:3306/javadb";
	    String DBID="root";
	    String DBPW="1234";	    
	    
	    try{
	        // 1. driver load
	        Class.forName(DRIVER);
	        // 2. connect DB
	        con = DriverManager.getConnection(DBURL,DBID,DBPW);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		 
		
	}
	
	
	/*
	 * return login result
	 */
	boolean resultLogin(String userId, String userPwd){
		
		boolean result = false;
	    try{
	  
	        // create sql & pstmt 
	        String sql ="select * from manager where pwd = password("+userPwd+") and id = '"+userId+"'";
	        
	        PreparedStatement pstmt =con.prepareStatement(sql);
	        
	        // execute sql statement  
	        ResultSet rs = pstmt.executeQuery();
	        
	        // result set processing  
	        if(rs.next()) {
	        	return result = true;	 
	        }else {
	        	return result = false;
	        }
	        
	        
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
		return result;
	}

} //end of class

