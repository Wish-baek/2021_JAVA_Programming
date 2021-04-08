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
		
		System.out.println("학생의 이름: "+SInform.name);
		System.out.println("학생의 학번: "+SInform.rollno);
		System.out.println("학생의 나이: "+SInform.age);
		
	}

}
