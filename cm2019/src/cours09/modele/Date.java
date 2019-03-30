package cours09.modele;

import java.io.Serializable;

public class Date implements Serializable {
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
