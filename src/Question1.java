import java.util.Scanner;

//Q. In a string S, remove consecutive duplicates from it recursively.
//
//Sample Input 1 :
//aabccba
//Sample Output 1 :
//abcba
public class Question1 {
    public static Object ConsecutiveDuplicate(StringBuffer str, int idx)
    {

        if(idx==str.length()-1)
        {
            return str;
        }
        if(str.charAt(idx)==str.charAt(idx+1))
        {
            str.deleteCharAt(idx+1);

        }
        else
        {
            idx=idx+1;
        }
        ConsecutiveDuplicate(str,idx);
        return str;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        StringBuffer s=new StringBuffer(readme.nextLine());
        System.out.println(ConsecutiveDuplicate(s,0));


    }
}
