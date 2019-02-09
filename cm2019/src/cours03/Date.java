package cours03;

import java.util.GregorianCalendar;

public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	
	public boolean estBissextile() {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(aaaa);
	}
	
	public Date(String dateString) {
		String tabString[] = dateString.split("/"); // décompose une chaine de caractères en sous-chaines
		jj = Integer.parseInt(tabString[0]); // transforme le String en entier
		mm = Integer.parseInt(tabString[1]);
		aaaa = Integer.parseInt(tabString[2]);
	}
	
	public String toString() {
		return jj+"/"+mm+"/"+aaaa;
	}

	public static void main(String[] args) {
		Date date = new Date("30/5/2000");
		System.out.println(date + " est une année bissextile? "+date.estBissextile());
		

	}

}
