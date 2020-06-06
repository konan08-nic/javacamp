package javacamp;

import java.math.BigInteger;

/**
 *
 * @author trabdlkarim
 */
 
public class JavaCampTester {
    public static void main(String[] args) {
        
        BigInteger bigint1 = new BigInteger("2024");
        BigInteger bigint2 = new BigInteger("1994");
        BigInteger result;
        BigInteger[] tab;
        
        // Addition
        result = bigint1.add(bigint2);
        System.out.println(String.format("%d + %d = %d",bigint1,bigint2,result));
        
        // Soustraction
        result = bigint1.subtract(bigint2);
        System.out.println(String.format("%d - %d = %d",bigint1,bigint2,result));
        
        // Multiplication
        result = bigint1.multiply(bigint2);
        System.out.println(String.format("%d * %d = %d",bigint1,bigint2,result));
        
        // Division Entière
        result = bigint1.divide(bigint2);
        System.out.println(String.format("%d / %d = %d",bigint1,bigint2,result));
        
        // Modulo
        result = bigint1.mod(bigint2);
        System.out.println(String.format("%d mod %d = %d",bigint1,bigint2,result));
        
        /* Division sans reste - cet opérateur renvoie un tableau contenant deux 
         objects de type BingInteger, le premier est le quotient entier de la 
         division et le second est le reste de la division.
         C'est en effet un opérateur pratique pour avoir le quotient et le 
         reste de la division en seul coup.
         */
        tab = bigint1.divideAndRemainder(bigint2);
        System.out.println(String.format("%d // %d = %d",bigint1,bigint2,tab[0]));
        System.out.println(String.format("%d mod %d = %d",bigint1,bigint2,tab[1]));
        
    }
}
