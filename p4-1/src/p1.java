import java.util.Scanner;

public class p1 {
	
	String name;
	int Student_Num;
	int age;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 Student;
		
		Scanner sc = new Scanner(System.in);
		
		Student = new p1();
		Student.name = "Baek";
		Student.Student_Num = 20181251;
		Student.age = 23;
		System.out.println("�л��� �̸�: " + Student.name);
		System.out.println("�л��� �й�: " + Student.Student_Num);
		System.out.println("�л��� ����: " + Student.age);
		
	}

}
