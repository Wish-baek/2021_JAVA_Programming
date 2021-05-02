
class complexnumber {
	int real;
	int imag;
	
	void count() {
		System.out.println(real + "+" + imag + "i");
	}
}

public class p4 {

	public static void main(String[] args) {

		complexnumber cp;
		cp = new complexnumber();
		
		cp.real = 10;
		cp.imag = 20;
		cp.count();
		
		
	}

}
