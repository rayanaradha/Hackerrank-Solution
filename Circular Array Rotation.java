//problem description::https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void circularArrayRotation(int[] a, int k, int[] queries) {
        int[] r= new int[a.length];
        k= k%a.length;
        for(int i=0 ;i<a.length ; i++){
            if(i+k<a.length){
                r[i+k]=a[i];
            }
            else{
                 int v=i+k-a.length;
                 r[v]=a[i];
            }
        }

        for(int z : queries){
            System.out.println(r[z]+" ");
        }
    }

    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         int n = x.nextInt();
         int ar[] = new int [n]; 
         int k = x.nextInt();
         int q = x.nextInt(); 
         int qq[] = new int [q];
         
         for(int i =0; i<n ;i++){
             ar[i] = x.nextInt();
         } 

         for(int i =0; i<q ;i++){
             qq[i] = x.nextInt();
         }   

         circularArrayRotation(ar,k,qq);   
    }
}
