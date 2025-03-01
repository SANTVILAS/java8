package optional_related_questions;

import java.util.Optional;

import Optional_Util_Class.Student;
import Optional_Util_Class.StudentDataBase;

public class OptionalExample {

	
	public static String getStudentName() {
	//	Student student=StudentDataBase.studentSupplier.get();
		Student student = null;
		if(student!=null) {
			return student.getName();
		}
		return null;
	}
	
	
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentOptional=Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
			if(studentOptional.isPresent()) {
				return studentOptional.map(Student::getName);
			}
			return Optional.empty();
		}
	
	public static void main(String[] args) {
		
//		String name=getStudentName();
//		if(name!=null) {
//			System.out.println(name.length());
//		}else {
//			System.out.println("Name not found");
//		}
		
		Optional<String> stringOptional=getStudentNameOptional();
		if(stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		}else {
			System.out.println("Name not found");
			
		}
	}
}
