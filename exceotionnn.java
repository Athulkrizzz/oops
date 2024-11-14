class NoVowelsException extends Exception {
    // Constructor to initialize the exception message
    public NoVowelsException() {
        super("Input does not contain any vowels.");
    }
}

public class exceotionnn
 {
    public static void main(String[] args) {
        
        try {
          
            checkForVowels("Hello");
       
            System.out.println("Input contains vowels.");
        } catch (NoVowelsException e) {
            
            System.out.println(e.getMessage());
        }
    }

  
    static void checkForVowels(String input) throws NoVowelsException {
        
        if (!input.matches(".*[aeiouAEIOU].*")) {
            
            throw new NoVowelsException();
        }
    }
}

    

