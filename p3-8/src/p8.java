import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {

		int a, b ;
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산을 입력하세요:");
		char i = sc.next().charAt(0);
		
		System.out.print("숫자 2개를 입력하세요:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (i == '+') 
			System.out.println((double) a+b);
		
		else if (i == '-') 
			System.out.println((double)a-b);
	
		else if (i == '*') 
			System.out.println((double)a*b);
		
		else if (i =='/' && b==0) 
			System.out.println("분모는 0이 될 수 없습니다.");
		
		else if (i=='/' && b!=0)
				System.out.println((double)a/b);
		
		
		 
	}

}
