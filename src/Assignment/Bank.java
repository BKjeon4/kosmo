package Assignment;

import java.util.Scanner;

public class Bank {
String bk = "BK Jeon";
	String bankacc = "city bank: 605-09606-260-01";
	int change;
	int dp;
	int wd;
	
	@Override
	public String toString() {
		return "Bank [예금주 :" + bk + ", 계좌 번호 :" + bankacc + ", 잔액 : " + change + "]";
	}
	Bank(){  	
	}
	public void deposit(int dp){
		this.dp = dp;
		change += dp;
		System.out.println("입금 금액 : " + dp + "원");
		
	}
	public void withdrawal(int wd) {
		this.wd = wd;
		int k = 0;
		k = (change -= wd);
		if(k<0) {
			System.out.println("잔액부족");
			change +=wd;		
		}else {
			System.out.println("인출 금액 : " + wd + "원");
		}
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("입금 금액 입력 : ");
		int dp = sc.nextInt();
		b.deposit(dp);
		
		System.out.println("출금 금액 입력 : ");
		int wd = sc.nextInt();
		b.withdrawal(wd);
		
		System.out.println(b.toString());
		
		sc.close();
	}
	
}
