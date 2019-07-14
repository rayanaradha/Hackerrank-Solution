problem description -https:https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  static void climbingLeaderboard(int[] s,int[] a) {
        int j=0;
        List<Integer> k = new ArrayList<Integer>();
        

        k.add(s[0]);
        for(int h=1 ; h<s.length ; h++){
            if(s[h]!=s[h-1]){
                k.add(s[h]);
            }
        }

        
        while((a.length>j)&&(a[j]<k.get(k.size()-1))){
                System.out.println(k.size()+1);
                j++;
        } 

        int i=k.size()-1 ;
        while((a.length>j)&&(i>-1)){
                 
            if(k.get(i)==a[j]){
                System.out.println(i+1);
                j++;
            }
            if(k.get(i)>a[j]){
                System.out.println(i+2);
                j++;
            }
            else{
                i--;
            }
         }

        while((a.length>j) && (a[j]>=k.get(0))){
                System.out.println(1);
                j++;
        }   
  }
      
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
        int t1= scanner.nextInt();
        int ar[] = new int[t1];
            for(int i=0 ; i<t1 ;i++){
                ar[i]= scanner.nextInt();
            }

        int t2= scanner.nextInt();
        int arr[] = new int[t2];
            for(int i=0 ; i<t2 ;i++){
                arr[i]= scanner.nextInt();
            }

     climbingLeaderboard(ar,arr);
    }
}
