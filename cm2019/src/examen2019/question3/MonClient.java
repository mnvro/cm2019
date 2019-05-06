package examen2019.question3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	public MonClient() throws UnknownHostException, IOException, ClassNotFoundException {
		super("127.0.0.1", 2019);
		ObjectInputStream ois = new ObjectInputStream(this.getInputStream());
		System.out.println(ois.readObject());
	}
	public static void main(String[] args) {
		System.out.println("Console d'un des clients\n========================");
		try {
			MonClient monClient = new MonClient();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
