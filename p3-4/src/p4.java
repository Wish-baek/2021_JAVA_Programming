import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {

		int h;
		int w;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		h=sc.nextInt();
		
		System.out.print("�����Ը� �Է��ϼ���: ");
		w=sc.nextInt();
		
		if (w<((h-100) * 0.9))
			System.out.println("��ü���Դϴ�.");
		if (w>((h-100) * 0.9))
			System.out.println("��ü���Դϴ�.");
		
	}

}
