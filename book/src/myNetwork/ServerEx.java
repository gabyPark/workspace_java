package myNetwork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		try(ServerSocket serverSoc = new ServerSocket(12345);) {
			
			System.out.println(">>>>>>> �ڰ��� ���� ���� <<<<<<<<");
			
			while(true) {
				Socket soc = serverSoc.accept();
				InputStream input = soc.getInputStream();
				OutputStream output = soc.getOutputStream();
				
				DataInputStream dInput = new DataInputStream(input);
				dInput.readUTF();
				String s = dInput.readUTF();
				
				System.out.println(s);
		
				DataOutputStream dOut = new DataOutputStream(output);
				dOut.writeUTF("�����Դϴ�");
				}
			
		} catch (Exception e) {
			System.out.println(">>>>>>> ���� ���� ���� <<<<<<<<");
			e.printStackTrace();
		}

		System.out.println(">>>>>>> ���� ���� <<<<<<<<");		
		
	}

}
