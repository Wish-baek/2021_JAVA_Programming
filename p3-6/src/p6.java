
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k=2; k<100; k++) {
			int count = 0;
			for (int i=2; i<k; i++) {
				if (k%i ==0)
					count = 1;
					break;
			}
			if (count == 0)
				System.out.print(k + " ");
		}
		
	}

}
