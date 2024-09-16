package coding;
import java.util.*;
public class Stringmutiplication {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String a = sc.nextLine();
		 String b = sc.nextLine();
		 int result = Integer.parseInt(a) * Integer.parseInt(b); //  String -> int
		 String resultString =   String.valueOf(result); // or use Integer.toString(result); // int -> String
		 System.out.println(resultString);
	}

}
