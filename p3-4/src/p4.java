import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {

		int h;
		int w;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		h=sc.nextInt();
		
		System.out.print("몸무게를 입력하세요: ");
		w=sc.nextInt();
		
		if (w<((h-100) * 0.9))
			System.out.println("저체중입니다.");
		if (w>((h-100) * 0.9))
			System.out.println("과체중입니다.");
		
	}

}
