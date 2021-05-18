package com;

public class Bank implements Customer, Manager, Admin, Cleark {

	public void deposit() {
		System.out.println("-- deposit method called");
	}

	public void withDraw() {
		System.out.println("-- withdrawing method called..");
	}

	@Override
	public void openAccount() {
		System.out.println("-- openAccount method got called");
	}

	@Override
	public void closeAccount() {
		System.out.println("-- closeAccount method git called..");
	}

	@Override
	public void lockerAccess() {
		System.out.println("-- locker Access granted...");
	}

	@Override
	public void clerkOperations() {
		System.out.println("--- Task given to Cleark...");
	}

}
