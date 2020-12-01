package com.java.oopsbasics.udemy;

public class Bank_Account_main {

	public static void main(String[] args) {
		
		Bank_Account ba = new Bank_Account(828229292, "Mohan", 10000);
		ba.deposit(100);
		ba.displayCurrentBalance();
		ba.withdraw(-100);
		ba.displayCurrentBalance();
		ba.withdraw(2000);
		ba.displayCurrentBalance();

	}

}
