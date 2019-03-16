package cours07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServeur {
	public static void main(String[] args) throws IOException {
		System.out.println("Console du serveur\n==================\n");
		System.out.println("on attend un client");
		ServerSocket monServeur = new ServerSocket(2019);
		Socket client = monServeur.accept(); // bloquant
		System.out.println("on a reçu un client");
		int i = client.getInputStream().read(); //bloquant
		System.out.println("on a reçu "+i);
		client.getOutputStream().write(5);
		
	}

}
