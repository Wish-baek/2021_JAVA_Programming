import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int i = (int) (Math.random() * 100);
		int guess;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess = sc.nextInt();
			
			if ( guess > i)
				System.out.println("HIGH");
			if (guess < i)
				System.out.println("LOW");
			
			count++;
			
		} while (guess != i);
		
		System.out.println("�����մϴ�. �õ�Ƚ��="+count);
		
	}

}
