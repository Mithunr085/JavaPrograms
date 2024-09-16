package coding;
import java.util.*;
import java.lang.*;

public class AttendanceScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int result =  (int) Math.pow(3,n);
		System.out.println(result);
		
	}

}

/*
import java.util.ArrayList;
import java.util.List;

public class AttendanceOutcomes {
    
    // Method to generate all attendance outcomes
    public static List<String> generateAttendanceOutcomes(int n) {
        List<String> outcomes = new ArrayList<>();
        int totalOutcomes = (int) Math.pow(3, n); // Total combinations
        
        // Generate outcomes iteratively
        for (int i = 0; i < totalOutcomes; i++) {
            StringBuilder currentOutcome = new StringBuilder();
            int value = i;
            
            // Convert the number to base 3
            for (int j = 0; j < n; j++) {
                int digit = value % 3; // Get the last digit in base 3
                currentOutcome.append(digit == 0 ? '0' : (digit == 1 ? '1' : '2'));
                value /= 3; // Move to the next digit
            }
            
            // Since we build the string in reverse order, we need to reverse it
            outcomes.add(currentOutcome.reverse().toString());
        }
        
        return outcomes;
    }

    public static void main(String[] args) {
        int n = 3; // You can change this value for different inputs
        List<String> results = generateAttendanceOutcomes(n);
        
        // Print all outcomes
        for (String outcome : results) {
            System.out.println(outcome);
        }
    }
}*/