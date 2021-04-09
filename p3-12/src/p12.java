import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score;
		int sum=0;
		int avr;
		
		
		for( int i=0; i<5; i++) {
			
		System.out.print("성적을 입력하세요: ");
		score = sc.nextInt();
		sum = sum + score;
		
		}
		System.out.print("합계 : " + sum);
		System.out.print("\n평균 : " + (double) sum / 5);
	}

}
