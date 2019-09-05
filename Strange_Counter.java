/*problem description
https://www.hackerrank.com/challenges/strange-code/copy-from/121729330
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the strangeCounter function below.
    static void strangeCounter(long t) {
        boolean x=true;
        long count=0;
        int i=0;
            while(x){
                count+=3*(Math.pow(2,i));
                if(count>=t){
                    x=false;
                }
                i++;
            }
        System.out.println(count -t+1);
    }

   
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    long t = scanner.nextLong();
    strangeCounter(t);
    }
}

