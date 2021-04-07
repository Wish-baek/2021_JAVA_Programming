
public class p5 {

	public static void main(String[] args) {

		int x;
		int y;
		
		for (x=0; x<=10; x++) {
			for ( y=0; y<=10; y++)
			if (3*x+10*y==100)
				System.out.println("("+x+","+y+")");
		}
		
	}

}
