


import java.util.*;
public class stringtoken 
{
    /**
     * @param args
     */
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 word string");
        String s=sc.nextLine();
        //String s="i am athul";
        StringTokenizer st=new StringTokenizer(s);
        String f=st.nextToken();
        String m=st.nextToken();
        String l=st.nextToken();
        String res="";
        res=String.valueOf(f.charAt(0))+String.valueOf(m.charAt(0));
        System.out.println(res+"\t"+l);

    }
    
}
