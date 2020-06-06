package javacamp

import java.math.BigInteger;

/**
 *
 * @author trabdlkarim
 */
public class S0004 {
	
     public static void main(String[] args) {
	BigInteger p = puissance(2,100)	
        int s = sommeDesChiffres(p)
        System.out.println(String.format("puissance(%d,%d) = %d",2,1000,p));
        System.out.println(String.format("somme(%d) = %d",p,s));
	     
	// OUTPUT:
	
	// pow(2,1000) = 10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983
	//               78815695858127594672917553146825187145285692314043598457757469857480393456777482423098542
        //               10746050623711418779541821530464749835819412673987675591655439460770629145711964776865421
	//	         67660429831652624386837205668069376
	
        //   somme(10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958
        //         5812759467291755314682518714528569231404359845775746985748039345677748242309854210746050623711418
        //         7795418215304647498358194126739876755916554394607706291457119647768654216766042983165262438683720
        //	   5668069376) = 1366
	
        }

	
    // Calule a puissance n (a^n)
    public BigInteger puissance(int a, int n){
	    
     BigInteger puissance = new BigInteger("1");
     BigInteger base = new BigInteger(String.valueOf(a));
     for (int i=n;i>0;i--){
       puissance = puissance.multiply(base);
     }
        return puissance;
    } 
	
    // Calule la somme des chiffres d'un grand nombre.
    public int sommeDesChiffres(BigInteger n){
    
        int somme = 0;
        BigInteger x = n;
	BigInteger[] result;
	    
        BigInteger base = new BigInteger("10");
        BigInteger bigZero = new BigInteger("0");
        
	    
        while(!x.equals(bigZero)){
          result = x.divideAndRemainder(base);
          somme += result[1].intValueExact();
          x = result[0];
        }
        return somme;
    }
}
