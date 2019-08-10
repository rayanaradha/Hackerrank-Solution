//problem description - https://www.hackerrank.com/challenges/the-grid-search/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
    static void gridSearch(int a, int b, String[] x, int c, int d, String [] y) {
        int i=0;   int j=0;
        boolean xx=true;
        while((i<a) && xx){
            for(int m=0 ; m<=b-d ; m++){
            String h=x[i].substring(m,(m+d));
                    if(h.equals(y[j])){
                    int u=i;
                    i++;j++;
                        while(j<c){
                         String hh=x[i].substring(m,(m+d));
                            if(!(hh.equals(y[j]))){
                               j=0;i=u;
                               break; 
                               }
                         i++;j++;
                        }
                        if(j==c){
                            xx=false;
                            break;
                        }
                    }    
            }
            i++;
        }
        if(!(xx)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        } 
    }

    public static void main(String[] args) throws IOException {
    Scanner x = new Scanner(System.in);
    int t =  x.nextInt();    
    for(int i=0 ;i<t ;i++){
        int xs =  x.nextInt();
        int xf =  x.nextInt();
        String arr[] = new String[xs];
            for(int j=0; j<xs ;j++){
                arr[j]= x.next();
            }
        int lxs =  x.nextInt();
        int lxf =  x.nextInt();
        String ar[] = new String[lxs];
            for(int j=0; j<lxs ;j++){
                ar[j]= x.next();
            }
            gridSearch(xs,xf,arr,lxs,lxf,ar);
    }    
 }
}
