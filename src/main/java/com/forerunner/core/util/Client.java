package com.forerunner.core.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args){
		int port=8888;
		try {
			Socket socket=new Socket("127.0.0.1",port);
			boolean flag=true;
			while(flag){
				ObjectInputStream serverinput = new ObjectInputStream(socket.getInputStream());
				 if(serverinput.readBoolean()){
					// new ClientThread(serverinput);
				 }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
