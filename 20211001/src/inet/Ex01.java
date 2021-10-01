package inet;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int port = 33333;
		InetSocketAddress endpoint = new InetSocketAddress("192.168.35.161", port);
		ServerSocket ss =new ServerSocket();
		ss.bind(endpoint);
		
		System.out.println("연결준비");
		
		Socket socket = ss.accept();
		System.out.println(socket.getRemoteSocketAddress());
	
		System.out.println("종료");
		socket.close();
	ss.close();
	}

}
