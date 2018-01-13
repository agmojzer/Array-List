import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemoApp {

	public static void main(String[] args) {
		doOldSchoolArrays();
		System.out.println("*************");
		doNewArrays();
		

	}
	public static void doOldSchoolArrays() {
		ArrayList students = new ArrayList();
		students.add("Eric");
		students.add("Luke");
		students.add("Bill");
		students.add("Andrew");
		students.add("Denise");
		students.add("Emilie");
		students.add("Joe");
		students.add("Lisa");
		
		for (int i=0; i<students.size(); i++) {
			String str = (String) students.get(i);
			System.out.println("Student name= " +str);
		}
	}
	
	public static void doNewArrays() {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Eric");
		students.add("Luke");
		students.add("Bill");
		students.add("Andrew");
		students.add("Denise");
		students.add("Emilie");
		students.add("Joe");
		students.add("Lisa");
		
		for (String s : students) { //Enhanced for loop
			System.out.println("Student" +students.indexOf(s)+ " name [jdk1.5]: "+s );
		}
		System.out.println("No for loop: " + students);
		
		if (students.contains("Lisa")){
			System.out.println("Lisa's Here!");
		if (students.contains("Sean")) 
			System.out.println("Sean's here!");
			
		System.out.println(students.indexOf("Joe"));
		System.out.println(students.get(2));
		
		//students.set(1, "Bob");
		//System.out.println(students);
		
		Collections.sort(students);
		System.out.println("Sorted students: " + students);
		
		students.remove(1);
		System.out.println(students); //removed the entry at index #1
		
		}
	}
}

