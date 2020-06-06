package javacamp;

import java.math.BigInteger;

/**
 *
 * @author trabdlkarim
 */
 
public class JavaCampTester {
    public static void main(String[] args) {
       
        S0004 sol = new S0004();
        
        BigInteger bigint1 = new BigInteger("2024");
        BigInteger bigint2 = new BigInteger("1994");
        BigInteger result;
        BigInteger[] tab;
        
        // Addition
        result = bigint1.add(bigint2);
        System.out.println(String.format("%d + %d = %d",bigint1,bigint2,result));
        
        result = bigint1.subtract(bigint2);
        System.out.println(String.format("%d - %d = %d",bigint1,bigint2,result));
        result = bigint1.multiply(bigint2);
        System.out.println(String.format("%d * %d = %d",bigint1,bigint2,result));
        
        result = bigint1.divide(bigint2);
        System.out.println(String.format("%d / %d = %d",bigint1,bigint2,result));
        
        result = bigint1.mod(bigint2);
        System.out.println(String.format("%d mod %d = %d",bigint1,bigint2,result));
        
        tab = bigint1.divideAndRemainder(bigint2);
        System.out.println(String.format("%d // %d = %d",bigint1,bigint2,tab[0]));
        System.out.println(String.format("%d mod %d = %d",bigint1,bigint2,tab[1]));
        
    }
}
