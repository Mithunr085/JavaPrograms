package coding;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean answer=true;
		int Acnt=0,Lcnt=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)) == 'A')
			{
				Acnt++;
				Lcnt=0;
				if(Acnt ==2)
					break;
			}
			else if(s.charAt(i)=='L')
			{
				Lcnt++;
				if(Lcnt ==3)
					break;
			}
			else
				Lcnt=0;
		}
		if(Acnt ==2 || Lcnt ==3)
		{
			answer=false;
			System.out.println(answer);
		}
		else
		{
			System.out.println(answer);
		}

	}

}
