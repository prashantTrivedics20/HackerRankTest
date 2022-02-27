import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        String s[]=new String[n];
        readme.nextLine();
        for(int i=0;i<s.length;i++)
        {
            s[i]=readme.nextLine();

        }
        int f=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].substring(0,2).equals("HR"))
            {
                f++;


            }
        }
        if(f<=0)
        {
            System.out.println("-1");
            return;
        }
        if(f>0)
        {
            System.out.println(f);
        }
        for(int i=0;i<n;i++)
        {
            if(s[i].substring(0,2).equals("HR"))
            {
                System.out.println(s[i].toUpperCase());

            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
}