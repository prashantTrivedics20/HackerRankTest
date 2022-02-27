import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=readme.nextLine();
        CharSequence ch=s.subSequence(1,3);// last index is not included in the
        System.out.println(ch);



    }
}
