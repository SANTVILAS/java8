package most_interview_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	private String name;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}


public class Test14_Employee_Sorting{

	
	
	public static void main(String[] args) {
		List<Employee> list=Arrays.asList(
				new Employee("vilas", 25, 1000),
				new Employee("sant", 24, 2000),
				new Employee("keshari", 27, 3000),
				new Employee("gupta", 26, 5000),
				new Employee("monu", 22, 8000)
			);
		
		List<Employee> sortedEmployee=list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		sortedEmployee.forEach(System.out::println);
		
		System.out.println("=========Sort by name=========");
		
		List<Employee> list4=list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        list4.forEach(System.out::println);
        
        System.out.println("===================Sort by age=========================================");
        
		List<Employee> sortByAge=list.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		sortByAge.forEach(System.out::println);
		
		System.out.println();
		
		List<Employee> sortBySal=list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
		sortBySal.forEach(System.out::println);
	}
	
}
