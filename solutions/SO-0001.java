package projet1;

public class SO0001 {

	public static void main(String[] args) {
		int i, som;
		som=0;
		for( i = 0; i < 1000; i++) {
			
			if(i%3==0 || i%5==0) {
				System.out.println(+i);
				som=som+i;
				
			}
			
			}
		System.out.println("la somme est \n"+som);
			
		}
	}
		

	
