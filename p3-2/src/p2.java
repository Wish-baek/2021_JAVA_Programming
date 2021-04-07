import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {

		String en;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		switch (num) {
		
		case 1:
			en ="ONE";
			break;
		
		case 2:
			en ="TWO";
			break;
			
		case 3:
			en ="THREE";
			break;
			
		case 4:
			en ="FOUR";
			break;
			
		case 5:
			en ="FIVE";
			break;
			
		case 6:
			en ="SIX";
			break;
			
		case 7:
			en ="SEVEN";
			break;
			
		case 8:
			en ="EIGHT";
			break;
			
		case 9:
			en ="NINE";
			break;
			
		default:
			en ="OTHER";
			break;
			
		}
		System.out.println(en);
	}

}
