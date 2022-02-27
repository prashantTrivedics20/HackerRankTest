import java.util.Scanner;

public class StringBuilderRivision {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        StringBuilder s=new StringBuilder(readme.nextLine());
       int i= s.lastIndexOf("p");

       // s.lastIndexOf( String str,int from index)
        System.out.println(i);

    }
}
