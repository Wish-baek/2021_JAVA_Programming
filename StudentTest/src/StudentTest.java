class Student {
	String name;
	int rollno;
	int age;
	
}
public class StudentTest {

	public static void main(String[] args) {

		Student SInfo;
		
		SInfo = new Student();
		
		SInfo.name = "Kim";
		SInfo.rollno = 20180001;
		SInfo.age = 20;
		
		System.out.println("�л��� �̸�: "+SInfo.name);
		System.out.println("�л��� �й�: "+SInfo.rollno);
		System.out.println("�л��� ����: "+SInfo.age);
		
	}

}
