import java.util.Scanner;

class Account{
	int balance=0;
	
	int withdraw(int amount) {
		balance = balance + amount;
		System.out.println(amount + "�� ����");
		
		return balance;
		
		}
	int deposit(int amount) {
		balance = balance - amount;
		System.out.println(amount + "�� ���");
		
		return balance;
	}
}

class Account2{
	int balance=0;
		
	int withdraw(int amount) {
		balance = balance + amount;
		System.out.println(amount + "�� ����");
		
		return balance;
		
		}
	int deposit(int amount) {
		balance = balance - amount;
		System.out.println(amount + "�� ���");
		
		return balance;
	}
	
}
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac;
		ac = new Account();
		System.out.println("���ο� ���°� ����������ϴ�.");
		
		ac.withdraw(50000);
		
		
		Account2 ac2;
		ac2 = new Account2();
		System.out.println("���ο� ���°� ����������ϴ�.");
		
		ac2.withdraw(100000);
		
		System.out.println("�� #1 ���� �ܰ�=" + ac.balance);
		System.out.println("�� #2 ���� �ܰ�=" + ac2.balance);
		
		
	
		
	}

}
