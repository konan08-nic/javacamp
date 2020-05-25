package projet1;

public class SO0001 {

	public static void main(String[] args) {
		int somme = multiple (5, 3);
        System.out.println( " La somme des multiples de 3 et 5 inferieurs a 1000: "  + somme);
		
	}
		
		
	public static  int multiple (int n, int m) {
		int i;
		int som=0;
		for (i=1; i<1000; i++) {
			if (i%n==0 || i%m==0) {
			som=som+i;	
			}
			
		}
		return som;

	

		
	}
	}

		

	
