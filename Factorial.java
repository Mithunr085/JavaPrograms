package coding;
import java.util.*;

public class Factorial {


	public void digitFactorial(int n)
	{	
		int fact[]= new int[100];// to store the factorial of digits 
		int index=0;// used as an index for fact array
		int num=n;// copy of number n
		while(num>0)// for positive number
		{
			int last=num%10;//last digit 123%10 = 3 i.e remainder  
			num/=10;// 123/10 = 12// to store the quotient 
			int ft=1;// to store the result of factorial of the remainder
			for(int i=last;i>=1;i--)// is used to get single digit factorial 
			{
				ft*=i;// 1*3.... 3*2 ....1*1
			}
			fact[index++]=ft;// storing the factorial of single digit in array fact and auto incrimenting the index
		}
		
		for(int i=(index-1);i>=0;i--)
		{
			System.out.println(fact[i]);// printing in reverse order 
		}
	}
	
	public static void main(String[] args) {
		Factorial f1= new Factorial();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Number too small .....");
			System.exit(0);
		}
		else if(n>32767)
		{
			System.out.println("Number too large......");
			System.exit(0);
		}
		f1.digitFactorial(n);

	}

}
