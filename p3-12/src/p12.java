import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score;
		int sum=0;
		int avr;
		
		
		for( int i=0; i<5; i++) {
			
		System.out.print("������ �Է��ϼ���: ");
		score = sc.nextInt();
		sum = sum + score;
		
		}
		System.out.print("�հ� : " + sum);
		System.out.print("\n��� : " + (double) sum / 5);
	}

}
