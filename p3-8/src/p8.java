import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		char i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		i = sc.next().charAt(0);
		System.out.print("���ڸ� �Է��ϼ���:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (i == '+')
			System.out.println((double) a + "+" + (double) b + "=" + (double) (a+b));
		if (i == '-')
			System.out.println((double) a + "-" + (double) b + "=" + (double) (a-b));
		if (i == '*')
			System.out.println((double) a + "*" + (double) b + "=" + (double) (a*b));
		if (i == '/')
			System.out.println((double) a + "/" + (double) b + "=" + (double) (a/b));
	}

}
