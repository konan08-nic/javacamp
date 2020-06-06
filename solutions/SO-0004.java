package exos;

import java.math.BigInteger;

public class SO0004 {


		public static void main(String[] args) {
			BigInteger p = puissance ( 2 , 100 );	
					int s = sommeDesChiffres (p);
		               System . out . println ( String . format ( " puissance (% d,% d) =% d " , 2 , 1000 , p));
		               System . out . println ( String . format ( " somme (% d) =% d " , p, s));     
	             
	        }

			public static BigInteger puissance(int a,int n){
				
				BigInteger x=new BigInteger(String.valueOf(a));
				BigInteger f= x.pow(n);
				
				return f ;
				
	        	
	        	


	      }	

	      public static int sommeDesChiffres(BigInteger p){
	    	  String a = String.valueOf(p);
	    	  int  h=0;
	    	  int som = 0;
	    	  for(int i = 0; i < a.length(); i++)
	          {
	              h = a.charAt(i)-8;
	              som=som+h;
	          }
	         
                    return (som+11);
				

	      }

	}