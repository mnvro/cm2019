package cours04;

public class TestFactoriel {
	/**
	 * @param n un entier positif ou null
	 * @return n!
	 */
	public static int factorielle(int n) throws NonPositiveException {
		if ((n==0)||(n==1))
			return 1;
		else
			if (n>0) {
				return n * factorielle(n-1);
				
			} else {
				throw new NonPositiveException();
			}
	}
	public static void main(String[] args) {
		try {
			int n = -5;
			System.out.println(n+"! ="+TestFactoriel.factorielle(n));
		} catch (NonPositiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
