package coding;
import java.util.*;

public class ClearExam {

	int cnt=0;
	public int passcount(int a[],int n) {
		int i=1;
		while(i<n)
		{
			if(a[i]>=70)
			{
				cnt++;
			}
			i+=2;
		}	
		return cnt;
	}
	public static void main(String[] args) {
		ClearExam ce = new ClearExam();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of students : ");
		int n =sc.nextInt();// no. of students
		if(n<0 || n%2!=0)
		{
			System.out.println("invalid No. of students .......");
			System.exit(0);
		}
		int a[]= new int[n];
		System.out.println("enter the roll no and marks of students :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();//roll no & marks 
			if(a[i]<0)
			{
				System.out.println("invalid details .......");
				System.exit(0);
			}
		}
		int cnt = ce.passcount(a, n);
		System.out.println("The total students cleared the exams are : "+(cnt));

	}

}
