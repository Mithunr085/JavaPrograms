package coding;

import java.util.Scanner;

public class UserAgeException {

    // Custom exception class
    class UserException extends Exception {
        public UserException(String message) {
            super(message);
        }
    }

    // Method to check the age
    public String checkAge(int age) throws UserException {
        if (age < 15) {
            throw new UserException("Invalid Age: " + age + ". Age must be 15 or older.");
        }
        return "Valid Age: " + age;
    }

    public static void main(String[] args) {
        UserAgeException ue = new UserAgeException();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        try {
            int age = scanner.nextInt();
            String message = ue.checkAge(age);
            System.out.println(message);
        } 
         catch (UserException e) {
           // System.out.println(e.getMessage());
        	 e.printStackTrace();
        }
    }
}
/*
 use database DB_WeekExpense;
 
 select avg(Expense) as avg_expense,WeekNumber from  tbl_WeekExpense where WeekNumber=5 ;

 */

