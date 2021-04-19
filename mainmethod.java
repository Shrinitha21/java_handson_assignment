package testcase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class mainmethod
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();		
		SimpleDateFormat obj = new SimpleDateFormat("dd-mm-yyyy");
		employees.add(new Employee("Rohini", "DataAnalysis", obj.parse("10-10-2000"), 45, 90000));
		employees.add(new Employee("Ranganathan", "Production", obj.parse("09-10-2000"), 45, 92000));
		employees.add(new Employee("Pankaj", "Marketing", obj.parse("02-02-2002"), 38, 75000));
		
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of\r\n" + "joining");
		System.out.println("Enter Your Choice");
		int choice = in.nextInt();
		switch(choice)
		{
			case 1: {
						Collections.sort(employees, new comparitor());
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						
						break;
					}
			case 2: {
						Collections.sort(employees, new agecomparitor());
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						break;
					}
			default:
					break;
		}
	
	}
}