package cours07;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Console du client\n================\n");
		Socket socket = new Socket("127.0.0.1", 2019);
		System.out.println("on est connecté au serveur");
		socket.getOutputStream().write(6);
		System.out.println("On a reçu du serveur : "+socket.getInputStream().read());
		
	}
}
