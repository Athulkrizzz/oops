
import java.io.File;
import java.io.IOException;

public class file{
    public static void main(String[] args) {
        // Specify the file path
       // String filePath = "example.txt";
        
        try {
            // Create a File object
            File file = new File("example.text");
            
            // Check if the file doesn't exist
            if (!file.exists()) {
                // Create a new file
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

