import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		int monthNumber;
		String month;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("달의 이름을 입력하시오: ");
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
