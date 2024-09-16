package coding;
import java.text.*;
import java.util.*;
public class Multiple5 {

	public float findAverageBy5(int number) {
		float multiple=0,index=1,sum=0;// multiple will store the multiples of 5
		float avg=0;
		while(multiple<=number)
		{
				multiple = index*5;// 5 tables here	
				if(multiple>number)
				{
					break;
				}
				sum+=multiple;// sum will store the sum of 5 multiples upto index number eg. :- 5+10+15..............
				index++;	
		}
		avg = sum/(index-1);// avg stores the average of 5 multiples upto index number 
		return avg;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		float avg;
		System.out.println("enter the number");
		n= sc.nextInt();
		if(n> 32767 || n<0)
		{
			System.out.println("Invalid ....");
			System.exit(0);
		}
		else if(n>0 && n<5)
		{
			System.out.println("average is 0");
			System.exit(0);
		}	
		Multiple5 mp = new Multiple5();
		avg=mp.findAverageBy5(n);
		DecimalFormat df = new DecimalFormat("#.00");// to precise the decimal point value
		String avg2 =df.format(avg);// rounding-off the float number 
		System.out.println(" Average : "+(avg2));
		
		
	}

}
