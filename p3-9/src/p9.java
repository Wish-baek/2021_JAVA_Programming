
public class p9 {

	public static void main(String[] args) {
		
		int sum=0;
		int a=0;
		int b=1;
		int c;
		
		System.out.print( a + " " + b + " ");
		
		for (int i=3; i< 11; i++) {
			c= a+b;
			a= b;
			b= c;
			System.out.print( c + " ");
		}
		
	}

}
