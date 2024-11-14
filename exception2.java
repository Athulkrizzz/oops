import java.util.*;
class NoVowelsException extends Exception
{
    public NoVowelsException()
    {
    super("No Vowels in the string");
    }
}
class exception2
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        try
        {
        checkForVowels(str);
        System.out.println("Input contains vowels");
            
        }
        catch(NoVowelsException e)
        {
            System.out.println(e);

        }


    }
    public static void checkForVowels(String string) throws NoVowelsException
    {
        if(!string.matches(".*[aeiouAEIOU].*"))
        {
            throw new NoVowelsException();
        }
    }

}