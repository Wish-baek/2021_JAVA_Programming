
public class p1 {

	public static void main(String[] args) {
	
		int i;
		int sum=0;
		
		for(i=0; i<101; i++) {
			if (i % 3==0 || i % 4 ==0) 
				sum = sum + i;
				
		}
		System.out.println("3 �Ǵ� 4�� ����� ��="+sum);
	}

}
