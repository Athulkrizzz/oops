import java.util.Random;

class NumberThread extends Thread {
    private int number;

    public NumberThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 == 0) { // Check if the number is even
            System.out.println("Even Number: " + number);
            System.out.println("Square of " + number + ": " + (number * number));
        } else {
            System.out.println("Odd Number: " + number);
            System.out.println("Cube of " + number + ": " + (number * number * number));
        }
    }
}

public class multithreading
 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        
        System.out.println("Random Number: " + randomNumber);
        
        // Create a thread and start it
        NumberThread thread = new NumberThread(randomNumber);
        thread.start();
    }
}
