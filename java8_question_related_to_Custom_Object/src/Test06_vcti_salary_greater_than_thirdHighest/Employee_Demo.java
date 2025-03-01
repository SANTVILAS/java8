package Test06_vcti_salary_greater_than_thirdHighest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee_Demo {

	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "A", 11, 1000));
        employees.add(new Employee(2, "B", 11, 2000));
        employees.add(new Employee(3, "C", 11, 3000));
        employees.add(new Employee(4, "D", 11, 2500));
        
        
        employees.stream()
        .map(Employee::getSalary)
        .distinct()
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .collect(Collectors.toList());
        
        
        
        List<Employee> result = employees.stream()
                .filter(emp -> emp.getSalary() > thirdHighestSalary)
                .collect(Collectors.toList());

        // Print the result
        result.forEach(System.out::println);
        
     
	}
}
