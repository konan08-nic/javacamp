package exos;

public class SO0004 {


		public static void main(String[] args) {
		       double p = puissance(2,1000);	
	               double s = sommeDesChiffres(p);
	               System.out.println("le  nombre 2 ** 1000 est" +p);
	               System.out.println("la somme des chiffres est" +s); 
	              
	             
	        }

			public static double puissance(double a,double n){
				double x=1;
				for( n=1000; n>0; n--) {
					
				 x=x*a;
			
			}
		return x;
	        	
	        	


	      }	

	      public static double sommeDesChiffres(double p){
	    	  String a = String.valueOf(p);
	    	  double h=0;
	    	  double som = 0;
	    	  for(int i = 0; i < a.length(); i++)
	          {
	              h = a.charAt(i)+10;
	              som=som+h;
	          }
	         
                    return som-1;
				

	      }

	}