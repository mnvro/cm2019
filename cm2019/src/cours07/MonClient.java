package cours07;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class MonClient extends Socket {
	public MonClient(int numPort) throws UnknownHostException, IOException {
		super("127.0.0.1",numPort);
	}
	
	public void ecrire(String s) {
		try {
			new ObjectOutputStream(this.getOutputStream()).writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String lire() {
		try {
			return (new ObjectInputStream(this.getInputStream()).readObject()).toString();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		try {
			System.out.println("Console du client\n==================");
			MonClient monClient = new MonClient(Integer.parseInt(JOptionPane.showInputDialog("Numéro de port : ")));
			System.out.println("on est connecté au serveur");
			monClient.ecrire("Toto");
			System.out.println("On a reçu " + monClient.lire());
		} catch (NumberFormatException | HeadlessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
