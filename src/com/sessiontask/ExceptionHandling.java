package com.sessiontask;

public class ExceptionHandling {

	public static void main(String[] args) throws WithdrawException {
		// TODO Auto-generated method stub
		
		Account ac = new Account(25000);   //initial balance 
//		ac.Withdraw(30000);           
		ac.Withdraw(20000);    //fine
		ac.showBalance();    //balance
		ac.Withdraw(10000);
		ac.showBalance();        //balance
		 
		 
	}
}

class Account {
	private int acc_balance = 0;

	public Account(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	void Withdraw(int amount) throws WithdrawException {
		if(amount > acc_balance) {
			throw new WithdrawException("handle Exception --> Insufficient Balance.");
		}
		else {
			System.out.println("Amount Withdrawn: "+amount);
			acc_balance -= amount;
		}
	}
	
	void showBalance() {
		System.out.println("Balance: "+acc_balance);
	}
	
}

class WithdrawException extends Exception{
	public WithdrawException(String str) {
		super(str);
	}
}