package coding;
import java.util.Scanner;

public class SquareFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the inputs
        long n = sc.nextLong(); // Length of the square
        long m = sc.nextLong(); // Width of the square
        long a = sc.nextLong(); // Size of the flagstone
        
        // Calculate the number of flagstones needed
        long flagstonesLength = (n + a - 1) / a; // Number of flagstones along the length
        long flagstonesWidth = (m + a - 1) / a;  // Number of flagstones along the width
        
        long totalFlagstones = flagstonesLength * flagstonesWidth; // Total flagstones needed
        
        // Output the result
        System.out.println(totalFlagstones);
        
        sc.close(); // Close the scanner
    }
}