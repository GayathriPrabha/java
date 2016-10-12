import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int i = scan.nextInt();
        int f;
        f=fact(i);
         System.out.println(f);
        
    }
         public static int fact(int n)
    {
       int result;
       if(n==1)
            return 1;
        else
            result = n * fact(n-1);
            return result;
    }
         
    }
