import  java.util.*;
import java.util.Scanner;
public class StringTokenizerclass {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        StringTokenizer s=new StringTokenizer(readme.nextLine());
//        while(s.hasMoreTokens())
//        {
//            System.out.println(s.nextToken());
//            System.out.println(s.countTokens());
//
//        }
        while(s.hasMoreElements())
        {
            //System.out.println(s.nextToken());
            System.out.println(s.nextElement());
        }
    }
}
