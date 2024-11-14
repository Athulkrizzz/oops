import java.io.File;
import java.io.IOException;

public class filecreartion 
{
    public static void main(String[] args)
    {
        try
        {

        
        File f=new File("Neeeee.txt");
        if(f.exists())
        {
            System.out.println("File already exists");


        }
        else{
        if(f.createNewFile())
        {
            System.out.println("File created succesfully");
        }
        else{
            System.out.println("Something went wrong");
        }
        }
    }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    
}
