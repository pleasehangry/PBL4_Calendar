
package Main;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	

	public static void main(String[] args) {
		new TCPServer();
	}
	public TCPServer() {
		ServerSocket server;
		Socket soc;
		try {
			server = new ServerSocket(3333);
			while(true) {
				soc = server.accept();
				System.out.println("Listenning");
				new ThreadHandler(this, soc).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}