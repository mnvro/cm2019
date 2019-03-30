package cours09;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import cours09.modele.Date;

public class MonServeurV1 extends ServerSocket {
	private Socket client;

	public MonServeurV1() throws IOException, ClassNotFoundException {
		this(0);
	}
	public MonServeurV1(int numPort) throws IOException, ClassNotFoundException {
		super(numPort);
		client = this.accept();
		new ObjectOutputStream(client.getOutputStream()).writeObject(new Date("30/12/1969"));
		System.out.println("On a reçu du client : " + new ObjectInputStream(client.getInputStream()).readObject());
	}
	public static void main(String[] args) {
		try {
			System.out.println("Console du Serveur\n==================");
			MonServeurV1 monServeur = new MonServeurV1(2019);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
