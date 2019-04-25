problem description -https://www.hackerrank.com/challenges/diwali-lights/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static void lights(BigInteger n) {
       BigInteger y= BigInteger.valueOf(100000); 
       BigInteger x=BigInteger.valueOf(2).modPow(n,y).subtract(BigInteger.ONE);
       System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n =x.nextInt();  
        for (int i= 0; i< n; i++) {
            BigInteger t = BigInteger.valueOf(x.nextInt());   
            lights(t);
        }
    }
}
