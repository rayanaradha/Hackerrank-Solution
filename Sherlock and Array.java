//problem description::https://www.hackerrank.com/challenges/sherlock-and-array/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the balancedSums function below.
    static void balancedSums(int ar[],int s ) {
        int sum1=ar[0];
        int sum2=ar[s-1]; 
        int i=1;
        int j=s-2;
        int count=2;
        while (count<s-1){
            if(sum1>sum2){
                sum2+=ar[j];
                j--;
            }
            else{
                sum1+=ar[i];
                i++;
            }
            count++;
        }
        if(sum1==sum2 || sum1==0 || sum2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws IOException {
       Scanner x = new Scanner(System.in);
       int t = x.nextInt();
       for(int i=0; i<t; i++){
           int l = x.nextInt();
           int ar[]= new int[l];
           for(int j=0; j<l; j++){
               ar[j]=x.nextInt();    
           }
           balancedSums(ar,l);
       } 
    }
}
