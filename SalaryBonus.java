package coding;
import java.util.*;
public class SalaryBonus {

	public int calculateBonus(int salary)
	{
		int bonus=0;
		if(salary>20000)
		{
			bonus=(int)(0.17*salary +1500);
		}
		else if(salary>15000)
		{
			bonus = (int)(0.15*salary+1200);
		}
		else if(salary >10000)
		{
			bonus=(int)(0.12*salary+1000);
		}
		else
			bonus=(int)(0.08*salary+500);
		return bonus;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary=sc.nextInt();
		if(salary<0)
		{
			System.out.println("Number too small.....");
			System.exit(0);
		}
		else if(salary>32767)
		{
			System.out.println("Number too big.....");
			System.exit(0);
		}
		else
		{
			SalaryBonus sb= new SalaryBonus();
			int bonus = sb.calculateBonus(salary);
			System.out.println(bonus);
		}		
	}

}
