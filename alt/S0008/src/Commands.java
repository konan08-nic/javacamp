/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calco;

/**
 *
 * @author trabdlkarim
 */
public class Commands {
 
    public int addition(int a, int b){
        return a+b;
    }
    
    public int subtraction(int a, int b){
        return a-b;
    }
    
    public int division(int a,int b){
    return a/b;
    }
    
    public int multiplication(int a , int b){
     return a*b;
    }
    
    public int modulo(int a,int b){
     return a%b;
    }

    public void help(){
     System.out.println("Simple Calculatrice Arithmetique");
     System.out.println("Calco v1.0.10");
     System.out.println("Liste des commands:");
     System.out.println("1. addition:       add num1 num2");
     System.out.println("2. soustraction:   sub num1 num2");
     System.out.println("3. multiplication: mul num1 num2");
     System.out.println("4. division:       div num1 num2");
     System.out.println("5. modulo:         mod num1 num2");
     System.out.println("6. aide:           affiche ce message d'aide");
     System.out.println("7. quit:           permet de quitter la calculatrice");
     System.out.println();
    }
    
    public void quit(){
     System.out.print("Au revoir, vous avez quitté calco."+"\n");
     System.exit(0);
    }
}
