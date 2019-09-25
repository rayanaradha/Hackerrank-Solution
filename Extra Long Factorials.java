//problem description::https://www.hackerrank.com/challenges/extra-long-factorials/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger x = BigInteger.valueOf(n);
        for(int i=1; i<n ;i++){
            x=x.multiply(BigInteger.valueOf(i)); 
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        extraLongFactorials(t);
         
    }
}

