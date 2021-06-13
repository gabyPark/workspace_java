package myNetwork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {

		Socket soc = null;
		
		try {
			soc = new Socket("192.168.5.31", 12345);
			InputStream is = soc.getInputStream();
			OutputStream os = soc.getOutputStream();
			
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dout = new DataOutputStream(os);
		
			dout.writeUTF("Ŭ���̾�Ʈ�Դϴ�");
			System.out.println(dis.readUTF());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				soc.close();
			} catch(Exception e) {
				
			}
		}
		
	}

}
