/problem description::https://www.hackerrank.com/challenges/encryption/submissions/code/107644327

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static void encryption(String s) {
    int x =(int) Math.sqrt(s.length());
    int h=x+1;
    int j=0;
        if(x*x==s.length()) {
            h=x;
        }

        while(j<h){
        for(int i=j ;i<s.length(); i+=h){
            System.out.print(s.charAt(i));
        }
       
        j++;
        System.out.print(" ");
        }
    }


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String h = scanner.next();
        encryption(h);
    }
}
