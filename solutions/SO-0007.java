package exos;

import java.util.ArrayList;

public class SO0007 {

public static void main(String[] args) {
		
		ArrayList<Integer> premiers = trouveNombresPremiers(1000);
		ArrayList<Integer> facteurs = trouveFacteursPremiers(1000);
		
                System.out.print("La liste des nombres premiers inferieurs à 1000: ");
		System.out.println(premiers);
		
		System.out.print("La liste des facteurs premiers de 1000: ");
		System.out.println(premiers);
			            
             }
             
      public static ArrayList<Integer> trouveNombresPremiers(int n){
    	 
    	  
    	ArrayList<Integer> array = new  ArrayList<Integer>(1);
    	  for(int i=2; i<=n;i++) {
    		  int t=0;
    		  for(int j=2; j<=(int) Math.sqrt(i);j++){
    		  if(i%j==0) {
    			  t=1;
    		  }
    			  
    		  }
    		  if(t==0) {
	    			
    				array.add(i);
    				   
    			  
    			  }
    		  }
    			  
    			 
    						  
		return array;
    	 


      }	
	
    public static ArrayList<Integer> trouveFacteursPremiers(int n){
    	ArrayList<Integer> fact = new  ArrayList<Integer>(1);
    	
    	 for(int i=1; i<=trouveNombresPremiers(n).size();i++) {
    		 if(n%trouveNombresPremiers(n)==0) {
    			 fact=trouveNombresPremiers(n);
    			n= n/trouveNombresPremiers(n);
    		 }
    	 }
    	
		return fact;
    

    }

}