
import java.util.*;

import javax.print.attribute.IntegerSyntax;
public class stringtoken 
{
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers in string format and leave space between every numbers:\n");
    String str=sc.nextLine();
    StringTokenizer st=new StringTokenizer(str);
    int sum=0;
    while(st.hasMoreTokens())
    {
        String s=st.nextToken();
        System.out.println(s+"");
        int n=Integer.parseInt(s);
        sum=sum+n;

    }
    System.out.println("sum is "+sum);
}
}