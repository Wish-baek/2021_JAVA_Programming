import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;
		int a=0;
		int b=1;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 항의 개수: ");
		count =sc.nextInt();
		System.out.print("0 1");
		
		for( int i=3; i <= count; i++) {
			
			c= b+a;
			a=b;
			b=c;		
			
			System.out.print(" " + c);
			
		}
		
		
		
	}

}
