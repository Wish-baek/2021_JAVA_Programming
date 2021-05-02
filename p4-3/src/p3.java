
/*class Date{
	int year;
	int month;
	int day;
	
	void print1() {
		System.out.println(year + "." + month + "." +day); 
				}
}
public class p3 {

	public static void main(String[] args) {
		Date d;
		d = new Date();
		d.year = 2012;
		d.month = 9;
		d.day = 5;
		d.print1();
	}

}
*/
public class p3 {
	int year;
	int month;
	int date;
	
	void print1() {
		System.out.println(year + "." + month + "." + date);
		}
	void print2() {
		switch (month) {
		case 1:
			System.out.println("Jan " + date + ", " + year);
			break;
		case 2:
			System.out.println("Feb " + date + ", " + year);
			break;
		case 3:
			System.out.println("Mar " + date + ", " + year);
			break;
		case 4:
			System.out.println("Apr " + date + ", " + year);
			break;
		case 5:
			System.out.println("May " + date + ", " + year);
			break;
		case 6:
			System.out.println("Jun " + date + ", " + year);
			break;
		case 7:
			System.out.println("July " + date + ", " + year);
			break;
		case 8:
			System.out.println("Aug " + date + ", " + year);
			break;
		case 9:
			System.out.println("Sep " + date + ", " + year);
			break;
		case 10:
			System.out.println("Oct " + date + ", " + year);
			break;
		case 11:
			System.out.println("Nov " + date + ", " + year);
			break;
		case 12:
			System.out.println("Dec " + date + ", " + year);
			break;
		default:
			System.out.println(" " + date + ", " + year);
			break;
		}
	}
	
	public static void main(String[] args) {
		p3 Date;
		Date = new p3();
		
		Date.year = 2012;
		Date.month = 9;
		Date.date = 5;
		Date.print1();
		Date.print2();
	}

}