package projet1;

public class SO0003 {
	

	public static void main(String[] args) {
		 
		int somme = nombre (20);
        System.out.println( " le plus petit nombre positif divisible par tous les nombres de 1 à 20 est: "  + somme);

	}
	public static  int nombre (int n) {
		
		 int P[] = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };
		int N = 20;
        int i;
        int s = 1, p = 1;
        for (i = 0; i < P.length; i++)
        {
            p = 1;
            while (p * P[i] < N)
                p = p*P[i];
            s= s*p;
        }
		return s;
		
	}

}
