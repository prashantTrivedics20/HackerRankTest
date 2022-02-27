// write a program to check weather two give string is anagram or not using  oops concept....
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=readme.nextLine();
        System.out.println("Enter the second String");
        String s2=readme.nextLine();
        char ch[]=s1.toCharArray();
        char ch1[]=s2.toCharArray();
        int c=0;
        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j <ch1.length ; j++) {
                if(ch[i]==ch1[j])
                {
                    c++;
                }
            }
        }
        if(c==ch.length)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
