package coding;

import java.util.*;

class Student 
{
	int rollNo;
	String name,email_id,ph_no,city,dob,percent;
	public Student(int rollNo, String name, String email_id, String ph_no, String city, String dob, String percent) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email_id = email_id;
		this.ph_no = ph_no;
		this.city = city;
		this.dob = dob;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email_id=" + email_id + ", ph_no=" + ph_no
				+ ", city=" + city + ", dob=" + dob + ", percent=" + percent + "]";
	}	
	
}

class RollNoComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.rollNo>s2.rollNo)
			return 1;
		else if(s1.rollNo<s2.rollNo)
			return -1;
		else
			return 0;
		
	}
	
}

public class StudentManagementsys {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("enter the choice 1.create 2.read 3.update 4.delete");
			int ch =sc.nextInt();
			switch (ch) {
			case 1: {
					System.out.println("creation.....");
					System.out.println("enter the student details Roll-no , name , e-mail , ph-no , city , dob , percent....");
					int rollNo = sc.nextInt();
					sc.nextLine();
					String name =sc.nextLine(),email_id=sc.nextLine(),ph_no=sc.nextLine(),city=sc.nextLine(),dob=sc.nextLine(),percent=sc.nextLine();
					list.add(new Student(rollNo, name, email_id, ph_no, city, dob, percent));
					break;
			}
			case 2: {
					System.out.println("reading....");
					Collections.sort(list, new RollNoComparator());
					for(Student student :list)
					{
						System.out.println(student);
					}
					break;
			}
			case 3:
			{
				System.out.println("updation.....");
				System.out.println("enter the roll no to be updated.......");
				int roll=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the new details");
				String name =sc.nextLine(),email_id=sc.nextLine(),ph_no=sc.nextLine(),city=sc.nextLine(),dob=sc.nextLine(),percent=sc.nextLine();			
				int index = -1;
				for (int i = 0; i < list.size(); i++)// loop the ArrayList to get index of the student with roll_no 
				{
					if (list.get(i).rollNo == roll)// Find the index of the student with the given roll number
					{
						index = i;
						break;
					}
				}
								
				if (index != -1)// Update the student details 
				{
					list.get(index).name = name;
					list.get(index).email_id = email_id;
					list.get(index).ph_no = ph_no;
					list.get(index).city = city;
					list.get(index).dob = dob;
					list.get(index).percent = percent;
				} else {
					System.out.println("Student with roll number " + roll + " not found.");
				}
				break;
			}
			case 4 :
			{
				System.out.println("deletion.....");
				System.out.println("enter the roll no to be deleted.......");
				int roll=sc.nextInt();				
				int index = -1;
				for (int i = 0; i < list.size(); i++) 
				{
					if (list.get(i).rollNo == roll)// Find the index of the student with the given roll number 
					{
						index = i;
						break;
					}
				}
			
				if (index != -1)// Remove the student from the list 
				{
					list.remove(index);
				} else {
					System.out.println("Student with roll number " + roll + " not found.");
				}
				break;
			}
			default:
				throw new IllegalArgumentException("enter the valid choice " + ch);
			}
		}

	}

}