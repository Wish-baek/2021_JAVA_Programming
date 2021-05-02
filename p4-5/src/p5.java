import java.util.Scanner;

class Account{
	int balance=0;
	
	int withdraw(int amount) {
		balance = balance + amount;
		System.out.println(amount + "원 저축");
		
		return balance;
		
		}
	int deposit(int amount) {
		balance = balance - amount;
		System.out.println(amount + "원 출금");
		
		return balance;
	}
}

class Account2{
	int balance=0;
		
	int withdraw(int amount) {
		balance = balance + amount;
		System.out.println(amount + "원 저축");
		
		return balance;
		
		}
	int deposit(int amount) {
		balance = balance - amount;
		System.out.println(amount + "원 출금");
		
		return balance;
	}
	
}
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac;
		ac = new Account();
		System.out.println("새로운 계좌가 만들어졌습니다.");
		
		ac.withdraw(50000);
		
		
		Account2 ac2;
		ac2 = new Account2();
		System.out.println("새로운 계좌가 만들어졌습니다.");
		
		ac2.withdraw(100000);
		
		System.out.println("고객 #1 계좌 잔고=" + ac.balance);
		System.out.println("고객 #2 계좌 잔고=" + ac2.balance);
		
		
	
		
	}

}
