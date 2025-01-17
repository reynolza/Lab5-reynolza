import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ls = new ArrayList<Integer>();
		if (n == 0){
			return ls;
		}
		int nbegin = n;
		for(int x=2; x<=Math.sqrt(nbegin); x++){
		while(n%x == 0)
		{
			ls.add(x);
			n = n/x;
		}}
		if (n > 1)
			ls.add(n);
		
		
		return ls;
			
	}

}
