import java.util.Scanner;
public class StringBufferRivision {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        StringBuffer s=new StringBuffer(readme.nextLine());
        String s1=s.substring(0);
        System.out.println(s1.hashCode());// it allocates the memory on the heap Area...
        System.out.println(s.hashCode());//it allocates the memory on the string pool Area...
       int a= s1.indexOf('e');
        System.out.println(a);
        s.replace(1,2,"hello");// replace(int start,int end,String str)
        s.capacity();
        s.insert(1,'o');
        System.out.println(s.length());
        System.out.println(s);
        s.setCharAt(0,'j');
        System.out.println(s);
        System.out.println(s.length());
        s.insert(0,"prashant");
        System.out.println(s);
        System.out.println(s.length());
        s.setLength(20);
        System.out.println(s.length());
       int b = s.capacity();
        System.out.println(b);
      int p=  s.lastIndexOf("p");
        System.out.println(p);
    }
}
