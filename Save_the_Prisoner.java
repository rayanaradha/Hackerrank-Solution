/*problem description
https://www.hackerrank.com/challenges/save-the-prisoner/copy-from/105477351
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void saveThePrisoner(long n, long m, long s) {
      long f= m%n;
        if((f+s-1)%n==0){
            System.out.println(n);
        } 
        else{
        System.out.println((f+s-1)%n);
        }
    }
  
    public static void main(String[] args)  {
        Scanner x= new Scanner(System.in);
        int t= x.nextInt();
        for(int i=0 ; i<t ;i++){
            long n= x.nextLong();
            long m= x.nextLong();
            long s= x.nextLong();
            saveThePrisoner(n,m,s);
        }

    }
}
