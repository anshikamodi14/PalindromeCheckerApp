public class PalindromeCheckerApp {
}
    // Application details
    static final String APP_NAME = "PalindromeCheckerApp";
    static final String VERSION = "1.0";

    // Main method - Entry point of the application
    public static void main(String[] args) {

        // Display welcome message
        displayWelcomeMessage();

        // Future use cases will continue from here
        System.out.println("Application is ready to check palindromes.");
        System.out.println("Proceeding to next module...\n");
    }

    // Method to display application informationgit
    public static void displayWelcomeMessage() {

        System.out.println("=====================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" Version: " + VERSION);
        System.out.println("=====================================");
        System.out.println("This application checks whether a");
        System.out.println("given string is a palindrome.\n");

    }
}