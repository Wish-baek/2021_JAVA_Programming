
public class p6 {

	public static void main(String[] args) {
		
		int k;
		int x;
		
		System.out.print("2���� 100���� ��� �Ҽ�: ");
		for (k=2; k<=100; k++) {
			int c=0;
			for (x=2; x<k; x++) {
				if ( k % x == 0) 
					c = c+1;
				
				
			}
			if (c <1)
				System.out.print(k + " ");
			
		}
		
	}

}
