package cours04;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestPing {

	public static void main(String[] args) {

		InetAddress ia;
		try {
			ia = InetAddress.getByName("Toto");
			System.out.println(ia.isReachable(10));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
