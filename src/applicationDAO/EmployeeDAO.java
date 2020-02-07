package applicationDAO;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entitiesTO.EmployeeTO;

public class EmployeeDAO {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		List <EmployeeTO> list = new ArrayList<>();
		
		System.out.println("How many Employees wich be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++){
			System.out.println();
			System.out.println("Employees# " + i);
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeTO(id, name, salary));
		}
		System.out.println("------------------------------");
		System.out.println("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		EmployeeTO emp = list.stream().filter(x -> x.getID()==id).findFirst().orElse(null);
		
		if(emp==null){
			System.out.println("This ID not exist! ");
		}
		else{
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);	
		}
		System.out.println();
		System.out.println("List of Employees: ");
		
		for(EmployeeTO obj: list){
			System.out.println(obj);
		}
		sc.close();
	}

}
