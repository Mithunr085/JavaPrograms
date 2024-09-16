package coding;
//cf
import java.util.*;
public class Magicwords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String a[] = new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			//String str = a[i];
			while(a[i].length()>10)
			{
				int num = a[i].length()-2;
				a[i]=a[i].charAt(0) +Integer.toString(num)+a[i].charAt(a[i].length()-1);
			}
		}

		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
