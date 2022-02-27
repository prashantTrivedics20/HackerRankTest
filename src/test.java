import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        StringBuffer s=new StringBuffer("abaca");
        char ch='b';
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)=='a')
            {
                s.replace(i,i+1,"x");
            }
        }
        System.out.println(s);
    }
}
