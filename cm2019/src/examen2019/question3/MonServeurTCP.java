package examen2019.question3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//•	le livre « Vingt mille lieues sous les mers » de Jules Verne qui fait 606 pages 
//et il envoie au second client 
//•	le livre « La mythologie selon Game of Thrones » de Gwendal Fossois qui fait 160 pages.

public class MonServeurTCP extends ServerSocket {
	private Socket clients[] = new Socket[2];

	public MonServeurTCP() throws IOException, InterruptedException {
		super(2019);
		clients[0] = this.accept();
		System.out.println("Client connecté");
		Thread.sleep(100);
		ObjectOutputStream oos = new ObjectOutputStream(clients[0].getOutputStream());
		oos.writeObject(new Livre("Vingt mille lieues sous les mers",  "Jules Verne", 606 ));
		clients[1] = this.accept();
		System.out.println("Client connecté");
		Thread.sleep(100);
		oos = new ObjectOutputStream(clients[1].getOutputStream());
		oos.writeObject(new Livre("La mythologie selon Game of Thrones", "Gwendal Fossois", 160));
		Thread.sleep(100);
	}
	public static void main(String[] args) throws InterruptedException {
		try {
			MonServeurTCP monServeurTCP = new MonServeurTCP();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
