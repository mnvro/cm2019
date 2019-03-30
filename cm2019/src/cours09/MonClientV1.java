package cours09;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import cours09.modele.Date;

public class MonClientV1 extends Socket {
	public MonClientV1() throws UnknownHostException, IOException, ClassNotFoundException {
		super("127.0.0.1",2019);
		System.out.println("On a reçu du serveur : " + new ObjectInputStream(this.getInputStream()).readObject());
		new ObjectOutputStream(this.getOutputStream()).writeObject(new Date("1/3/1997"));
	}
	public static void main(String[] args) {
		try {
			System.out.println("Console du client\n=================");
			MonClientV1 monClient = new MonClientV1();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
