package coding;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the N value");
		long n=sc.nextInt();
		System.out.println("enter the D value");
		long d=sc.nextInt();
		int cnt=0,dcnt=0;
		long last,num=n;
		while(n>0)
		{
			last=n%10;
			if(last==d)
			{
				dcnt++;
			}
			cnt++;
			n/=10;
		}
		System.out.println("the total digits in "+num+" are : "+cnt);
		System.out.println("the total "+d+" in the "+num+" are "+dcnt);
	}

}
