package most_interview_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class Student {
	private int studentId;
	private String stuedentName;

	public Student(int studentId, String stuedentName) {
		super();
		this.studentId = studentId;
		this.stuedentName = stuedentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStuedentName() {
		return stuedentName;
	}

	public void setStuedentName(String stuedentName) {
		this.stuedentName = stuedentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stuedentName=" + stuedentName + "]";
	}

}


public class Tets15_Sorting_Student_Demo {
	
	
	public static void main(String[] args) {

		List<Student> studentList=Arrays.asList(
				new Student(10, "sant"),
				new Student(30, "vilas"),
				new Student(20, "keshari")
				);
		
		List<Student> list1=studentList.stream().sorted(Comparator.comparing(Student::getStuedentName)).collect(Collectors.toList());;
		list1.forEach(x->System.out.println(x));
		
		//======================
		System.out.println("========================================================");
		List<Student> list2=studentList.stream().sorted(Comparator.comparingInt(Student::getStudentId)).collect(Collectors.toList());;
		list2.forEach(x->System.out.println(x));
	}
}
