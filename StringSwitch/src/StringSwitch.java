import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		int monthNumber;
		String month;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �̸��� �Է��Ͻÿ�: ");
		month = sc.next();
		
		switch (month) {
			case "january":
				monthNumber = 1;
				break;
			case "february":
				monthNumber = 2;
				break;
			case "march":
				monthNumber = 3;
				break;
			default:
				monthNumber = 0;
				break;
		}
		
		System.out.println(monthNumber);
	}

}
