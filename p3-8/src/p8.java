import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {

		int a, b ;
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		char i = sc.next().charAt(0);
		
		System.out.print("���� 2���� �Է��ϼ���:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (i == '+') 
			System.out.println((double) a+b);
		
		else if (i == '-') 
			System.out.println((double)a-b);
	
		else if (i == '*') 
			System.out.println((double)a*b);
		
		else if (i =='/' && b==0) 
			System.out.println("�и�� 0�� �� �� �����ϴ�.");
		
		else if (i=='/' && b!=0)
				System.out.println((double)a/b);
		
		
		 
	}

}
