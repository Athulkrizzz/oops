import java.util.*;
class EvenException extends Exception
{
    EvenException(String s)
    {
        super("even number encountered");
    }
} 
public class exception 
{
    public static void number(int n) throws EvenException
    {
        if((n%2)==0)
        {
            throw new EvenException("EvenException Encountered");
        }
        else{
            System.out.println("Entry Successfull");
        }
    }
    public static void main(String []args)
    {
       try{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
     number(num);
       }
       catch(EvenException e)
       {
        System.out.println(e);
       }
    }
}
