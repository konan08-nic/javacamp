package javacamp;

public class SO0001 {

     public static void main(String[] args) {
		
	int pan = panlidrome(3);
        System.out.println("Le plus grand palidrome obtenu a partir du produit de 2 nombres a 3 chiffres est: " + pan);
			            
             }
     public boolean isPanlidrome(int n){
      int x = n;
      String intString = ""; 
      if(String.valueOf(n).length()==1)
          return true;
      
        while(x!=0){
         intString += x%10;
         x = (int) x/10;
        }
        
        return String.valueOf(n).equals(intString);
    }

      // Détermine le plus grand panlidrome obetnu à partir deux nombres à trois 
      public static int panlidrome(int n){

           
        String l="99";
        for(int i=0;i<n-2;i++)
            l+="9";
        int limit = Integer.parseInt(l);
        int pan = -1;
        for (int i=limit;i>0;i--){
            for(int j=limit;j>0;j--)
                if(isPanlidrome(i*j))
                {
                    pan = i*j;
                    break;
                }
            
                break;
            }
        return pan;

      }	

}
		
