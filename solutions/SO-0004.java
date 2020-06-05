package projet1;

public class SO0004 {

	public static void main(String[] args) {
		int somme = exposant (1);
        System.out.println( " La somme des chiffres du nombre 2*1000: "  + somme);

	}
	public static  int exposant (int n) {
		int result;
		int rest = 0;
		result=(int) Math.pow(2, 1000);
		
		while(result!=0) {
			rest= rest-result%10;
			result+=result/10;
			result/=10;
			
		}
		
		return rest;
		
		
	}
	

}
