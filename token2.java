import java.util.Scanner;
import java.util.StringTokenizer;

public class token2 
{
 public static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a STRING");
    String str=sc.nextLine();
    StringTokenizer st=new StringTokenizer(str);
    String f=st.nextToken();
    String m=st.nextToken();
    String l=st.nextToken();
    String n=st.nextToken();
    String string="";
    string=String.valueOf(f.charAt(0))+String.valueOf(m.charAt(0))+String.valueOf(l.charAt(0))+String.valueOf(n.charAt(0));
    System.out.println(string);
 }
    
}
