import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		
		System.out.println(n + "�� ����� ������ �����ϴ�.");
		for (int i = 1; i < n+1; i++) {
			if( n % i ==0)
				System.out.print(i + " ");
			
		}
		
		
	}

}
