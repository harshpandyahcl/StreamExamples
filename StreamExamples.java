package streamproject;
import java.util.*;
public class StreamExamples {

	private int id;
    private  String name;
    private int age;
    private double salary;
 
    public StreamExamples(int id, String name, int age, double salary) {
        
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
		List <StreamExamples> employeeDetails = new ArrayList<StreamExamples>(); 
		employeeDetails.add(new StreamExamples(1, "Harsh",25,9000f));
		employeeDetails.add(new StreamExamples(2, "Jay",40, 30000f));
		employeeDetails.add(new StreamExamples(1, "John", 50, 46000f));
		employeeDetails.add(new StreamExamples(1, "Josh", 60, 51000f));
		
		employeeDetails.stream().filter(emp -> emp.getAge() >30).forEach(System.out::println);
		employeeDetails.stream().filter(emp -> emp.getAge() >50 && emp.getAge() < 60).forEach(System.out::println);
		employeeDetails.stream().filter(emp -> emp.getSalary() >10000 ).forEach(System.out::println);
		

	}

}
