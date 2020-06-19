package exos;

public class SO0010 {

	public static void main(String[] args) {
		 int somme = termeDeFibonacciAyantNChiffres ( 1000 );
         System .out . println ( " Le premier terme de la suite de Fibonacci ayant 10 chiffres est: "  + somme);
         int so = fibonacci ( 45 );
         System .out . println (  + so);
		                    
      }

	 public  static  int  fibonacci ( int  n ) {
    	 int nb1=0,nb2=1,nb3 = 0,i;
    		  if(n==1 ) {
    			  return 1;
    	}
    		  else {
    			for(i=2;i<=n; i++) {
    			nb3=nb1+nb2;
    			nb1=nb2;
    			nb2=nb3;
    			}
    			}  
    			 
    	  
		return nb3;

      }	


public  static  int  termeDeFibonacciAyantNChiffres ( int  n ) {
	  int x= 0 ;
      
      
		 for(n=100; n>=1;n-- ) {
			int z=fibonacci(n);
			 String a=String.valueOf(z);
		 if(a.length()==10) {
			 x=n;
			  }
		 
		 }	
     
	return x;

   
}
         
      }

      



