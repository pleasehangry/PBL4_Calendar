
package Main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadHandler extends Thread{
	TCPServer server;
	Socket incomming;
	public DataInputStream dis;
	public DataOutputStream dos;
	public ThreadHandler(TCPServer server, Socket soc) {
		this.server = server;
		this.incomming = soc;
		try {
			this.dis = new DataInputStream(incomming.getInputStream());
			this.dos = new DataOutputStream(incomming.getOutputStream());
		} catch (Exception e) {
                    e.printStackTrace();
		}
	}
	public void run() {
		try {
			while(true) {
                            String ClientSent = this.dis.readUTF();
                            if(!ClientSent.equals("")){
                                String cmd = ClientSent.split(",")[0];
                                int data = Integer.parseInt(ClientSent.split(",")[1]);
                                String content = ClientSent.split(",")[2];
                                if(cmd.equals("GetYear")){
                                    switch (content) {
                                        case "minusOne":
                                            this.dos.writeUTF("ReturnYear,"+ (data-1) +",minusOne");
                                            break;
                                        case "addOne":
                                            this.dos.writeUTF("ReturnYear,"+ (data+1) +",minusOne");
                                            break;
                                        case "fromInput":
                                            this.dos.writeUTF("ReturnYear,"+ (data) +",fromInput");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                }
                                else if( cmd.equals("getDetailMonth")){
                                    //
                                }
                            }
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
