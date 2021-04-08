class NumberBox {
	
	public int ivalue;
	public float fvalue;
		
	}
public class NumberBoxTest {
	public static void main(String[] args) {
		NumberBox NB;
		NB = new NumberBox();
		NB.ivalue = 10;
		NB.fvalue = (float)1.2345;
		System.out.println(NB.ivalue);
		System.out.println(NB.fvalue);
		}
			
}
