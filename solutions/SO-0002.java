package projet1;

public class SO0002 {

	public  static  void  main ( String [] args ) {

		int pan = panlidrome ( 3 );
           System.out.println ( " Le plus grand palidrome obtenu à partir du produit de 2 nombres à 3 chiffres est: "  + pan);

             }

      public static  int  panlidrome ( int  n ) {
    	  int prod=1;
    	  int max=0	;
    	  for (int x=100; x<1000; x++) {
    		  for (int y=100; y<1000; y++) {
    			  prod= x*y;
    			  if(drome(prod)) {
    				  if(prod>max) {
    					  max=prod;
    				  }
    			  }
    			  }
    	  } 
    		 
    		 
    	 
		return max;
}
      
                 private static boolean drome(int number) {
                  String abc = String.valueOf(number);
                  String cba="";
                for (int i = abc.length(); i>0; i--) {
                      cba += abc.charAt(i-1);
                   
                             }
                      
                        return abc.equals(cba);
                       }
      
}