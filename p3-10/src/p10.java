
public class p10 {

	public static void main(String[] args) {

		double[] a= {1.0, 2.0, 3.0, 4.0};
		double sum = 0;
		double max = a[0];
		
		for (int i=0; i<4; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i=0; i<4; i++) {
			sum= sum + a[i];	
		}
		
		System.out.print("\n합은 "+sum);
		
		for (int i=0; i<4; i++) {
			if (a[i] > max)
				max = a[i];
			
		}
		
		System.out.print("\n최대값은 "+max);
	}

}
