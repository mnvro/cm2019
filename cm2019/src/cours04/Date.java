package cours04;

public class Date implements Comparable<Date> {
	private int jj;
	private int mm;
	private int aaaa;
	
	public Date() {
	}

	public Date(int jj, int mm, int aaaa) {
		this.jj = jj;
		this.mm = mm;
		this.aaaa = aaaa;
	}
	
	public Date (String dateS) {
		String tabString[] = dateS.split("/");
		jj = Integer.parseInt(tabString[0]);
		mm = Integer.parseInt(tabString[1]);
		aaaa = Integer.parseInt(tabString[2]);
	}

	public String toString() {
		return jj + "/" + mm + "/" + aaaa;
	}

	public int compareTo(Date uneAutreDate) {	
		return (this.aaaa*10000+this.mm*100+this.jj) - (uneAutreDate.aaaa*10000+uneAutreDate.mm*100+uneAutreDate.jj);
	}

}
