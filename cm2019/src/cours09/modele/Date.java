package cours09.modele;

public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	
	public Date(String s) {
		String tabS[] = s.split("/"); 	//30/12/2019
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
	}
	public String toString() {
		return jj+"/"+mm+"/"+aaaa;
	}
}
