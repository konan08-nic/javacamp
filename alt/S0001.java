package javacamp;

import java.util.List;

public class S0001 {

    public static void main(String[] args) {
	List<Integer> list = multiplesDeTroisEtCinq(1000);
        System.out.println(list);
        System.out.println("La somme des multiples de 3 et 5 inferieurs a 1000: " + somme(list));
			            
             }

    public static List  multiplesDeTroisEtCinq(int n){
        
     List multiples = new ArrayList() ;
     for (int i=6;i<n;i++) 
         if( (i%3==0) || (i%5==0))
             multiples.add(i);
     return multiples;
    }
    
    
    public static int somme(List<Integer> list){
        int somme = 0;
        somme = list.stream().map((i) -> i).reduce(somme, Integer::sum);
        return somme;
     
    }

      }	

}
		
