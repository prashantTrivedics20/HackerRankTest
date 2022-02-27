import java.util.Scanner;
public class DeleteCount {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        StringBuffer s = new StringBuffer(readme.nextLine());
        int c = 0;
        int len=s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j =i+1; j <s.length(); j++) {
                if(s.charAt(i)==s.charAt(j))
                {
                    s.deleteCharAt(j);
                    c++;
                    j--;

                }
                else
                {
                   i=j;
                }
            }
        }
        System.out.println(c);
        System.out.println(s);
    }
}
