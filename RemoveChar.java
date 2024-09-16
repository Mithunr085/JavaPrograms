package coding;

import java.util.*;

public class RemoveChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the character to remove:");
        char C = sc.nextLine().charAt(0);

        int startIndex = str.indexOf(C);
        int endIndex = str.lastIndexOf(C);

        // Create a StringBuilder to build the result
        StringBuilder ans = new StringBuilder();

        // Check if the character exists in the string
        if (startIndex != -1) {
            // Loop through the string and append characters to the result
            for (int i = 0; i < str.length(); i++) {
                // Skip the first occurrence at startIndex and endIndex
                if (i != startIndex && i != endIndex) {
                    ans.append(str.charAt(i));
                }
            }
        } else {
            // If the character is not found, return the original string
            ans.append(str);
        }

        System.out.println("Resulting string: " + ans.toString());
        sc.close();
    }
}

/* DATABASE ASSIGNMENT
 USE school; -- Select the database

-- Change the size of the name column
ALTER TABLE student 
MODIFY name VARCHAR(25);

-- Set rollno as the primary key
ALTER TABLE student 
ADD PRIMARY KEY (rollno);

 */
