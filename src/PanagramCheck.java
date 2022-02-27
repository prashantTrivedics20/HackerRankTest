import java.util.Scanner;
// write a string program to check weather a string  contains all the alphabates or not
public class PanagramCheck {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        System.out.println(s.subSequence(1,10));
        char []s1=s.toCharArray();
        System.out.println(s1);
        boolean [] b=new boolean[26];
        int index=0;
        int f=1;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
               index= s.charAt(i)-'a';
            }
            else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                index=s.charAt(i)-'A';
            }
            b[index]=true;
        }
        for (int i = 0; i <=25; i++) {
            if(b[i]==false)
            {
                f=0;
            }
        }
        if(f==1)
        {
            System.out.println("panagram");
        }
        else
        {
            System.out.println("not panagram");
        }
    }
}
