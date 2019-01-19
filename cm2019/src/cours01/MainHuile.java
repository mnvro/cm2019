package cours01;

public class MainHuile {
	public static void main(String[] args){

		Huile huile1 = new Huile("orange sanguine",10,2.2);
		System.out.println(huile1);

		Huile huile2 = new Huile();
		huile2.setNom("eucalyptus radié");
		huile2.setVolume(30);
		huile2.setPrix(5.9);
		System.out.println(huile2);

	}

}
