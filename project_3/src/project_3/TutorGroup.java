package project_3;
import java.util.*;

public class TutorGroup {
	
	private String name;
	private ArrayList<Student> students;
	
	public TutorGroup(String name, ArrayList<Student> students) {
		this.name = name;
		this.students = students;
	}
	
	public String toString() {
		return "Tutor "+this.name+" with students: "+this.students.toString();
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public ArrayList<Student> getStudents() {
		return this.students;
	}
}