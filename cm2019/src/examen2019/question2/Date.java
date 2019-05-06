package examen2019.question2;

public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	public Date (String s) {
		String tabS [] = s.split("/");
		jj = Integer.parseInt(tabS[0]);
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
	}
	public String toString() {
		return jj+"/"+mm+"/"+aaaa;
	}
}
