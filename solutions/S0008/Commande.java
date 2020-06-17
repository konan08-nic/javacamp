package calco;

public class Commande {
	
	public int addition(int N1,int N2) {
		
		
		return N1+N2;	
	}
	
	public int soustration(int N1,int N2) {
		
		return N1-N2;	
	}
	public int multiplication(int N1,int N2) {
		
		return N2*N2;
		
	}
	public int division(int N1,int N2) {
		
		return N1/N2;	
	}
		
	public int reste(int N1,int N2) {
		
		return N1%N2;	
	}
	
	public void aide() {
		System.out.println("casio rogramable v1.0 \n");
		System.out.println("liste des Commandes \n");
		System.out.println("..............................................................................\n");
		System.out.println("1.addition: elle permet de faire la somme de deux nombres n1+n2 \n");
		System.out.println("..............................................................................\n");
		System.out.println("1.soustration: elle permet de faire la soustration de deux nombres n1-n2 \n");
		System.out.println("..............................................................................\n");
		System.out.println("1.multiplication: elle permet de faire la multiplication de deux nombres n1*n2 \n");
		System.out.println(".............................................................................. \n");
		System.out.println("1.division: elle permet de faire la division de deux nombres n1/n2 \n");
		System.out.println("..............................................................................\n");
		System.out.println("1.reste: elle permet d'obtenir le reste de la division de deux nombres n1/n2 \n");
		System.out.println("..............................................................................\n");
		System.out.println("quiter: elle permet de sortir de la calculatrice \n");
		System.out.println(".............................................................................. \n");
	}
	
	public void quitter() {
		System.out.println("aurevoir et  bientôt! \n");
		System.exit(0);	
	}

}
