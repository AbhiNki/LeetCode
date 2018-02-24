package level_easy;
//Count the number of prime numbers less than a non-negative number, n
public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int countPrime=countPrimeNumbers(n);
		System.out.println(countPrime);

	}
	
	public static int countPrimeNumbers(int n)
	{
		boolean[] m = new boolean[n];
        int count = 1;
        for (int i=2; i<n; i++) {
            if (m[i])
                continue;
             
            count++;
            for (int j=i; j<n; j=j+i)
                m[j] = true;
        }
         
        return count;
	}

}
