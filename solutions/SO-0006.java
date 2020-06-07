package exos;

public class SO0006 {

public  static  void  main ( String [] args ) {
		
		int somme = sommeDesTermesDeFibonacci ( 1000 );
                System . out . println ( " La somme des termes de la suite de Fibonacci inferieurs à 1000 est: "  + somme);
			  
          	  
                int s = fibonacci ( 1);
                System . out . println (s);
                
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

                    



	public  static  int  sommeDesTermesDeFibonacci ( int  n ) {
    
    	int i=1,s=0;
    	int som = 0;
    	for( i=2; i<=n;i++) {
    		s=fibonacci(i);
    		if(s%2==0 && s<=1000) {
    		som=som+s;	
    		break;
    	}
    
    }
		return som;

}
    }
