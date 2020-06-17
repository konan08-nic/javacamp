package calco;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		
		Commande cmd =  new  Commande ();
		Scanner scan = new Scanner(System.in);
			int count=1;
			int t1 = 0;
			int t2 = 0;
			int rep=0;
			while (true){
				
				 while (true){
				        System.out.print("Calco["+count+"]: ");
				        String input = scan.nextLine();
				        String[] k = input.split(" ");

				        String op = k[0];
				        if(k.length == 3){
				           try{
				           t1 = Integer.parseInt(k[1]);
				          t2 = Integer.parseInt(k[2]);}
				           catch(Exception ex){
				            System.err.println("les nombres doivent etre des entiers"+"\n");
                             count++;
				            continue;
				           }
				        }
				        else if (k.length == 2){
				           System.err.println("vous devez entrer trois données"+"\n");
				            count++;
				            continue;
				        }
				        else if (k.length > 3){
				            System.err.println("vous devez entrer trois données"+"\n");
				            count++;
				            continue;
				        }

				        if(op.equals("add")){
				          rep = cmd.addition(t1,t2);
				        }
				        else if(op.equals("sub")){
				        	 rep = cmd.soustration(t1, t2);
				       }
				       else if(op.equals("mul")){
				    	   rep = cmd.multiplication(t1, t2);
				       }
				       else if(op.equals("div")){
				         try{
				        	 rep = cmd.division(t1,t2);}
				         catch(ArithmeticException e){
				           System.err.println("pas de division par zero"+"\n");
				            count++;
				            continue;
				         }
				       }
				       else if(op.equals("mod")){
				         try{
				        	 rep = cmd.reste(t1, t2);}
				         catch(ArithmeticException e){
				           System.err.println("pas de division par zero"+"\n");
                             count++;
				            continue;
				         }
				       }
				       else if(op.equals("aide")){
				         cmd.aide();
				         count++;
				         continue;
				       }
				       else if(op.equals("quit")){
				         cmd.quitter();;
				       }

				       else{
				        System.err.println("votre commande n'est pas définie"+"\n");
				        count++;
				        continue;
				       }

				       System.out.println("Out["+count+"]: "+ rep+"\n");
				       count++;
				       }
			}   }

	}