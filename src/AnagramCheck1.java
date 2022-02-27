import java.util.*;
import java.util.Scanner;
public class AnagramCheck1 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=readme.nextLine();
        System.out.println("Enter the second String");
        String s2=readme.nextLine();
        char ch[]=s1.toCharArray();
        char ch1[]=s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(ch);
        System.out.println(ch1);
        if(Arrays.equals(ch,ch1))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anogram");
        }
    }
}
