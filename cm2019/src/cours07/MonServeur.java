package cours07;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServeur extends ServerSocket {
	Socket client;

	public MonServeur() throws IOException {
		super(0);
		System.out.println("Le serveur écoute sur le port " + this.getLocalPort());
		client = this.accept();
	}
	
	public String lire() throws IOException, ClassNotFoundException {
		return new ObjectInputStream(client.getInputStream()).readObject().toString();
	}
	
	public void ecrire(String s) {
		try {
			new ObjectOutputStream(client.getOutputStream()).writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Console du Serveur\n=================");
			MonServeur monServeur = new MonServeur();
			
			
			System.out.println("on a reçu " + monServeur.lire());
			monServeur.ecrire("Bonjour");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
