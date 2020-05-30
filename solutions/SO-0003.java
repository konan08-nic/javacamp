package projet1;

public class SO000 {

	public static void main(String[] args) {
		int somme = nombre (20);
        System.out.println( " le plus petit nombre positif divisible par tous les nombres de 1 à 20 est: "  + somme);

	}
	public static  int nombre (int n) {
		long max= Long.MAX_VALUE;
		int r=0;
		
			for(int i=1; i<max; i++) {
if(i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0 && i%10==0 && i%11==0 && i%12==0 && i%13==0 && i%14==0 && i%15==0 && i%16==0 && i%17==0 && i%18==0 && i%19==0 && i%20==0 && n!=0) {
					
					r=i;
					break;
				}
				
			}
		
		return r;
		
	}

}
