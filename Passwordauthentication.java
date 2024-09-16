package coding;

//@FunctionalInterface
//interface Validate{
//	public boolean validate(String username, String password);
//}
//
//public class Passwordauthentication {
//	public static void main(String[] args) {
//		
//
//	}
//
//}
import java.util.stream.Stream;

public class  Passwordauthentication {

    // Method to validate username and password
    public static boolean validate(String username, String password) {
        // Define the correct username and password
        String correctUsername = "ABC";
        String correctPassword = "DEF";

        // Use a stream to check if the username and password match the correct values
        return Stream.of(new String[]{username, password})
                     .filter(s -> s.equals(correctUsername) || s.equals(correctPassword))
                     .count() == 2; // Count should be 2 if both match
    }

    // Main method for testing
    public static void main(String[] args) {
        Source source = new Source();
        
        // Test cases
        System.out.println(Passwordauthentication.validate("Alexa", "coded123")); // Output: false
        System.out.println(Passwordauthentication.validate("ABC", "DEF")); // Output: true
        System.out.println(Passwordauthentication.validate("ABC", "coded123")); // Output: false
        System.out.println(Passwordauthentication.validate("Alexa", "DEF")); // Output: false
    }
}