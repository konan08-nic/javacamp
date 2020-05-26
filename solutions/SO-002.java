package projet1;

public class SO002 {

	public static void main(String[] args) {
		int pan = panlidrome ( 3 );
		
        System . out . println ( " Le plus grand palidrome obtenu à partir du produit de 2 nombres à 3 chiffres est: "  + pan);

     }


	private static int panlidrome(int n) {
		int prod,i;
		prod=1;
		i=1;
		
		int v = 0;
		for ( i=1; i<112; i++) {
				
		if(n==3 && v%i==0 ) {
			prod= 9*Math.max(0, i);
		}
			
		}
 
		return prod;
	}
}