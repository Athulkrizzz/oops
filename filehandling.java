import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

class filehandling {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try 
        {
             FileWriter fin = new FileWriter("New.txt");
            // FileReader f1=new FileReader("Neeeee.txt")
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the text to be entered in file");
             String str;
           while(!(str=sc.nextLine()).equals("exit"))
         //while((str=sc.nextLine())!=-1)
             {
                fin.write(str+"\n");
             }
      

             fin.close();
             sc.close();
           
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
