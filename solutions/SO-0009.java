package exos;

import java.math.BigInteger;

public class SO0009 {

	public static void main(String[] args) {
		BigInteger p = puissance ( 2 , 100 );	
		int s = sommeDesChiffres (p);
           System . out . println ( String . format ( " puissance (% d,% d) =% d " , 2 , 100 , p));
           System . out . println ( String . format ( " somme (% d) =% d " , p, s));
           
     double t =Math.pow(2, 100);
     System . out . println ("c'est" +t);
}

public static BigInteger puissance(int a,int n){
	BigInteger x=new BigInteger(String.valueOf(a));
	BigInteger t=new BigInteger("1");
	for(int i=n; i>0; i--) {
	t=t.multiply(x);
	}
	
	return t;

}	

public static int sommeDesChiffres(BigInteger p){
  String a = String.valueOf(p);
 
  int som = 0;
 
  for(int i = 0; i < a.length(); i++)
	  
  {
	  char c= a.charAt(i);
	  int z=Character.getNumericValue(c);
	  
      som=som+z;
  }
 
        return som;
	

	}

}
