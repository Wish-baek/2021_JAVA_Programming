class Student {
	String name;
	int rollno;
	int age;
	
}
public class StudentTest {

	public static void main(String[] args) {

		Student SInform;
		
		SInform = new Student();
		
		SInform.name = "Kim";
		SInform.rollno = 20180001;
		SInform.age = 20;
		
		System.out.println("�л��� �̸�: "+SInform.name);
		System.out.println("�л��� �й�: "+SInform.rollno);
		System.out.println("�л��� ����: "+SInform.age);
		
	}

}
