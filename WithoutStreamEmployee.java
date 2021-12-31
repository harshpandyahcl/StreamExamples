package streamproject;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamEmployee {
	private int id;
	private String name;
	private int age;
	private float salary;
	
	
	public WithoutStreamEmployee(int id, int age, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	public String toString() {
		 
        return "Id: "+ this.id +"Name: "+ this.name +" | Age: "+ this.age +" | Salary: "+this.salary;
    }
	public int getId() {
        return id;
 	}
 
 
    public String getName() {
        return name;
    }
 

 
    public int getAge() {
        return age;
    }
 
 
    public double getSalary() {
        return salary;
    }
 
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <WithoutStreamEmployee> employeeDetails = new ArrayList<WithoutStreamEmployee>(); 
		employeeDetails.add(new WithoutStreamEmployee(1, 25,"Harsh",900f));
		employeeDetails.add(new WithoutStreamEmployee(2, 40,"dana", 1200f));
		employeeDetails.add(new WithoutStreamEmployee(1, 50, "bill", 1300f));
		employeeDetails.add(new WithoutStreamEmployee(1, 60, "Josh", 51000f));
		
		for(WithoutStreamEmployee emp : employeeDetails) {
			if((emp.getName().startsWith("b")||emp.getName().startsWith("d"))&&(emp.getAge()>30)&&(emp.getSalary()>1000)){
				System.out.println(emp);
			}
			
		}
		
	

	}

}
