import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		
		int month;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month = sc.nextInt();
		
		}	while ( month < 1 || month > 12);
		System.out.print("����ڰ� �Է��� ����: " + month);
		
		
	}

}
