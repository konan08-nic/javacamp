/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calco;

import java.util.Scanner;

/**
 *
 * @author trabdlkarim
 */
public class Calculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Commands cmd = new Commands();
       Scanner scanner = new Scanner(System.in);
       int cmd_count = 1;
       int arg1=0;
       int arg2=0;
       int result=0;
       while (true){
        System.out.print("Calco["+cmd_count+"]: ");
        String input = scanner.nextLine();
        String[] cmd_args = input.split(" ");
        
        String op = cmd_args[0];
        if(cmd_args.length == 3){
           try{
            arg1 = Integer.parseInt(cmd_args[1]);
            arg2 = Integer.parseInt(cmd_args[2]);}
           catch(Exception ex){
            System.err.println("Err: les arguments doivent etre des entiers"+"\n");
            cmd_count++;
            continue;
           }
        }
        else if (cmd_args.length == 2){
           System.err.println("Err: vous avez fourni peu d'arguments"+"\n");
            cmd_count++;
            continue;
        }
        else if (cmd_args.length > 3){
            System.err.println("Err: vous avez fourni trop d'arguments"+"\n");
            cmd_count++;
            continue;
        }
        
        if(op.equals("add")){
          result = cmd.addition(arg1,arg2);
        }
        else if(op.equals("sub")){
         result = cmd.subtraction(arg1,arg2);
       }
       else if(op.equals("mul")){
         result = cmd.multiplication(arg1,arg2);
       }
       else if(op.equals("div")){
         try{
         result = cmd.division(arg1,arg2);}
         catch(ArithmeticException ae){
           System.err.println("Err: division par zero"+"\n");
            cmd_count++;
            continue;
         }
       }
       else if(op.equals("mod")){
         try{
         result = cmd.modulo(arg1,arg2);}
         catch(ArithmeticException ae){
           System.err.println("Err: division par zero"+"\n");
            cmd_count++;
            continue;
         }
       }
       else if(op.equals("aide") || op.equals("help") ){
         cmd.help();
         cmd_count++;
         continue;
       }
       else if(op.equals("quit")||op.equals("exit")){
         cmd.quit();
       }
       
       else{
        System.err.println("Err: commande non definie."+"\n");
        cmd_count++;
        continue;
       }
        
       System.out.println("Out["+cmd_count+"]: "+ result+"\n");
       cmd_count++;
       }
    }
    
}
